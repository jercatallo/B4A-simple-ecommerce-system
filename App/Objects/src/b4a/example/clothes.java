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

public class clothes extends Activity implements B4AActivity{
	public static clothes mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.clothes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (clothes).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.clothes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.clothes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (clothes) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (clothes) Resume **");
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
		return clothes.class;
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
            BA.LogInfo("** Activity (clothes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (clothes) Pause event (activity is not paused). **");
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
            clothes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (clothes) Resume **");
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
public b4a.example.shoes _shoes = null;
public b4a.example.blouse _blouse = null;
public b4a.example.drinks _drinks = null;
public b4a.example.meals _meals = null;
public b4a.example.pants _pants = null;
public b4a.example.shorts _shorts = null;
public b4a.example.snacks _snacks = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Activity.LoadLayout(\"layClothes\")";
mostCurrent._activity.LoadLayout("layClothes",mostCurrent.activityBA);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="txtprice.Text = 0";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="TabHost1.AddTab(\"Blouse\",\"layblouse.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Blouse","layblouse.bal");
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="TabHost1.AddTab(\"Pants\",\"layshorts.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Pants","layshorts.bal");
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="TabHost1.AddTab(\"Shorts\",\"laypants.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Shorts","laypants.bal");
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"b";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"blouse1.jpg").getObject()));
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets, \"b";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"blouse2.jpg").getObject()));
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets, \"b";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"blouse3.jpg").getObject()));
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets, \"s";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"short1.jpg").getObject()));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets, \"s";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"short2.jpg").getObject()));
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets, \"s";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"short3.jpg").getObject()));
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pants1.jpg").getObject()));
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pants2.jpg").getObject()));
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="ImageView9.Bitmap = LoadBitmap(File.DirAssets, \"p";
mostCurrent._imageview9.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pants3.jpg").getObject()));
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="clothes";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public static String  _btnaccept_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaccept_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub btnaccept_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If txtprice.Text = 0 Then";
if ((mostCurrent._txtprice.getText()).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="ToastMessageShow(\"Please Complete your order for";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please Complete your order for Clothes"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Main.priceforclothes = txtprice.Text";
mostCurrent._main._priceforclothes /*String*/  = mostCurrent._txtprice.getText();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Msgbox(\"Transaction for Clothes Confirmed\",\"Succ";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Transaction for Clothes Confirmed"),BA.ObjectToCharSequence("Successful"),mostCurrent.activityBA);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="End Sub";
return "";
}
public static String  _btnclear_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclear_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub btnclear_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="CheckBox1.Checked=False";
mostCurrent._checkbox1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="CheckBox2.Checked=False";
mostCurrent._checkbox2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="CheckBox3.Checked=False";
mostCurrent._checkbox3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="CheckBox4.Checked=False";
mostCurrent._checkbox4.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="CheckBox5.Checked=False";
mostCurrent._checkbox5.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="CheckBox6.Checked=False";
mostCurrent._checkbox6.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="CheckBox7.Checked=False";
mostCurrent._checkbox7.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="CheckBox8.Checked=False";
mostCurrent._checkbox8.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="CheckBox9.Checked=False";
mostCurrent._checkbox9.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="txtprice.Text = 0";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="ToastMessageShow(\"Cleared\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cleared"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnhome_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub btnhome_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox1_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub CheckBox1_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If CheckBox1.Checked = True Then";
if (mostCurrent._checkbox1.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="txtprice.Text = txtprice.Text + 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+300));
 }else {
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="txtprice.Text = txtprice.Text - 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-300));
 };
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox2_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox2_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub CheckBox2_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If CheckBox2.Checked = True Then";
if (mostCurrent._checkbox2.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="txtprice.Text = txtprice.Text + 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+500));
 }else {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="txtprice.Text = txtprice.Text - 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-500));
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox3_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox3_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox3_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub CheckBox3_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If CheckBox3.Checked = True Then";
if (mostCurrent._checkbox3.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="txtprice.Text = txtprice.Text + 400";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+400));
 }else {
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="txtprice.Text = txtprice.Text - 400";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-400));
 };
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox4_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox4_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox4_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub CheckBox4_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If CheckBox4.Checked = True Then";
if (mostCurrent._checkbox4.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="txtprice.Text = txtprice.Text + 100";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+100));
 }else {
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="txtprice.Text = txtprice.Text - 100";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-100));
 };
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox5_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox5_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox5_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub CheckBox5_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If CheckBox5.Checked = True Then";
if (mostCurrent._checkbox5.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="txtprice.Text = txtprice.Text + 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+200));
 }else {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="txtprice.Text = txtprice.Text - 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-200));
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox6_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox6_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox6_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub CheckBox6_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If CheckBox6.Checked = True Then";
if (mostCurrent._checkbox6.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="txtprice.Text = txtprice.Text + 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+300));
 }else {
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="txtprice.Text = txtprice.Text - 300";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-300));
 };
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox7_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox7_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox7_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub CheckBox7_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If CheckBox7.Checked = True Then";
if (mostCurrent._checkbox7.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="txtprice.Text = txtprice.Text + 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+500));
 }else {
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="txtprice.Text = txtprice.Text - 500";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-500));
 };
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox8_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox8_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox8_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub CheckBox8_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If CheckBox8.Checked = True Then";
if (mostCurrent._checkbox8.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="txtprice.Text = txtprice.Text + 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+200));
 }else {
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="txtprice.Text = txtprice.Text - 200";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-200));
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox9_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox9_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkbox9_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub CheckBox9_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If CheckBox9.Checked = True Then";
if (mostCurrent._checkbox9.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="txtprice.Text = txtprice.Text + 600";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))+600));
 }else {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="txtprice.Text = txtprice.Text - 600";
mostCurrent._txtprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtprice.getText()))-600));
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
}