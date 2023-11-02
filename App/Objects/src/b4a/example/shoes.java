package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class shoes extends Activity implements B4AActivity{
	public static shoes mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.shoes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (shoes).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.shoes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.shoes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (shoes) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (shoes) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return shoes.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (shoes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (shoes) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            shoes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (shoes) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview8 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtprice = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox3 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox4 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox5 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox6 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox7 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox8 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox9 = null;
public b4a.example.main _main = null;
public b4a.example.clothes _clothes = null;
public b4a.example.blouse _blouse = null;
public b4a.example.drinks _drinks = null;
public b4a.example.meals _meals = null;
public b4a.example.pants _pants = null;
public b4a.example.shorts _shorts = null;
public b4a.example.snacks _snacks = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Activity.LoadLayout(\"layShoes\")";
mostCurrent._activity.LoadLayout("layShoes",mostCurrent.activityBA);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="txtprice.Text = 0";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="TabHost1.AddTab(\"Heels\",\"layheels.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Heels","layheels.bal");
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="TabHost1.AddTab(\"Wedges\",\"laywedges.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Wedges","laywedges.bal");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="TabHost1.AddTab(\"Loafers\",\"layloafers.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Loafers","layloafers.bal");
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"h";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels1.jpg").getObject()));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets, \"h";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels2.jpg").getObject()));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets, \"h";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels3.jpg").getObject()));
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges1.jpg").getObject()));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges2.jpg").getObject()));
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges3.png").getObject()));
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets, \"l";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"loafers1.png").getObject()));
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets, \"l";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"loafers2.jpg").getObject()));
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="ImageView9.Bitmap = LoadBitmap(File.DirAssets, \"l";
mostCurrent._imageview9.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"loafers3.jpg").getObject()));
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="shoes";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _btnaccept_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaccept_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub btnaccept_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If txtprice.Text = 0 Then";
if ((mostCurrent._txtprice.getText()).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="ToastMessageShow(\"Please Complete your order for";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please Complete your order for Clothes"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Main.priceforshoes = txtprice.Text";
mostCurrent._main._priceforshoes /*String*/  = mostCurrent._txtprice.getText();
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Msgbox(\"Transaction for Clothes Confirmed\",\"Succ";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Transaction for Clothes Confirmed"),BA.ObjectToCharSequence("Successful"),mostCurrent.activityBA);
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="End Sub";
return "";
}
public static String  _btnclear_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclear_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub btnclear_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="CheckBox1.Checked=False";
mostCurrent._checkbox1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="CheckBox2.Checked=False";
mostCurrent._checkbox2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="CheckBox3.Checked=False";
mostCurrent._checkbox3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="CheckBox4.Checked=False";
mostCurrent._checkbox4.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="CheckBox5.Checked=False";
mostCurrent._checkbox5.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="CheckBox6.Checked=False";
mostCurrent._checkbox6.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="CheckBox7.Checked=False";
mostCurrent._checkbox7.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="CheckBox8.Checked=False";
mostCurrent._checkbox8.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="CheckBox9.Checked=False";
mostCurrent._checkbox9.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="txtprice.Text = 0";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="ToastMessageShow(\"Cleared\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cleared"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnhome_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub btnhome_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox1_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub CheckBox1_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If CheckBox1.Checked = True Then";
if (mostCurrent._checkbox1.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="txtprice.Text = txtprice.Text + 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+300));
 }else {
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="txtprice.Text = txtprice.Text - 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-300));
 };
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox2_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox2_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub CheckBox2_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If CheckBox2.Checked = True Then";
if (mostCurrent._checkbox2.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="txtprice.Text = txtprice.Text + 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+500));
 }else {
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="txtprice.Text = txtprice.Text - 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-500));
 };
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox3_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox3_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox3_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub CheckBox3_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If CheckBox3.Checked = True Then";
if (mostCurrent._checkbox3.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="txtprice.Text = txtprice.Text + 400";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+400));
 }else {
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="txtprice.Text = txtprice.Text - 400";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-400));
 };
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox4_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox4_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox4_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub CheckBox4_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="If CheckBox4.Checked = True Then";
if (mostCurrent._checkbox4.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="txtprice.Text = txtprice.Text + 100";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+100));
 }else {
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="txtprice.Text = txtprice.Text - 100";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-100));
 };
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox5_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox5_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox5_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub CheckBox5_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If CheckBox5.Checked = True Then";
if (mostCurrent._checkbox5.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="txtprice.Text = txtprice.Text + 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+200));
 }else {
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="txtprice.Text = txtprice.Text - 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-200));
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox6_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox6_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox6_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub CheckBox6_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If CheckBox6.Checked = True Then";
if (mostCurrent._checkbox6.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="txtprice.Text = txtprice.Text + 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+300));
 }else {
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="txtprice.Text = txtprice.Text - 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-300));
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox7_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox7_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox7_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub CheckBox7_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If CheckBox7.Checked = True Then";
if (mostCurrent._checkbox7.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="txtprice.Text = txtprice.Text + 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+500));
 }else {
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="txtprice.Text = txtprice.Text - 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-500));
 };
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox8_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox8_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox8_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub CheckBox8_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If CheckBox8.Checked = True Then";
if (mostCurrent._checkbox8.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="txtprice.Text = txtprice.Text + 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+200));
 }else {
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="txtprice.Text = txtprice.Text - 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-200));
 };
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox9_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox9_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox9_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub CheckBox9_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="If CheckBox9.Checked = True Then";
if (mostCurrent._checkbox9.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="txtprice.Text = txtprice.Text + 600";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+600));
 }else {
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="txtprice.Text = txtprice.Text - 600";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-600));
 };
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="End Sub";
return "";
}
}