package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class meals_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"laymeals\")";
Debug.ShouldStop(16777216);
meals.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("laymeals")),meals.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(33554432);
meals.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnaccept_Click (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,62);
if (RapidSub.canDelegate("btnaccept_click")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","btnaccept_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub btnaccept_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If txtprice.Text = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",meals.mostCurrent._txtprice.runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 64;BA.debugLine="ToastMessageShow(\"Please Complete your order for";
Debug.ShouldStop(-2147483648);
meals.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please Complete your order for Meals")),(Object)(meals.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 66;BA.debugLine="Main.priceforshoes = txtprice.Text";
Debug.ShouldStop(2);
meals.mostCurrent._main._priceforshoes /*RemoteObject*/  = meals.mostCurrent._txtprice.runMethod(true,"getText");
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Transaction for Meals Confirmed\",\"Succes";
Debug.ShouldStop(4);
meals.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Transaction for Meals Confirmed")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Successful"))),meals.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
meals.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnclear_Click (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,54);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","btnclear_click");}
 BA.debugLineNum = 54;BA.debugLine="Private Sub btnclear_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="radiotinola.Checked = False";
Debug.ShouldStop(4194304);
meals.mostCurrent._radiotinola.runMethodAndSync(true,"setChecked",meals.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="radiosinigang.Checked = False";
Debug.ShouldStop(8388608);
meals.mostCurrent._radiosinigang.runMethodAndSync(true,"setChecked",meals.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 57;BA.debugLine="radioadobo.Checked = False";
Debug.ShouldStop(16777216);
meals.mostCurrent._radioadobo.runMethodAndSync(true,"setChecked",meals.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(67108864);
meals.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhome_click() throws Exception{
try {
		Debug.PushSubsStack("btnhome_Click (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,50);
if (RapidSub.canDelegate("btnhome_click")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","btnhome_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub btnhome_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
meals.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private radiotinola As RadioButton";
meals.mostCurrent._radiotinola = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private radiosinigang As RadioButton";
meals.mostCurrent._radiosinigang = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private radioadobo As RadioButton";
meals.mostCurrent._radioadobo = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtprice As EditText";
meals.mostCurrent._txtprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radioadobo_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radioadobo_CheckedChange (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,46);
if (RapidSub.canDelegate("radioadobo_checkedchange")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","radioadobo_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 46;BA.debugLine="Private Sub radioadobo_CheckedChange(Checked As Bo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="txtprice.Text = 70";
Debug.ShouldStop(16384);
meals.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(70));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiosinigang_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radiosinigang_CheckedChange (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,42);
if (RapidSub.canDelegate("radiosinigang_checkedchange")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","radiosinigang_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 42;BA.debugLine="Private Sub radiosinigang_CheckedChange(Checked As";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="txtprice.Text = 40";
Debug.ShouldStop(1024);
meals.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(40));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiotinola_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radiotinola_CheckedChange (meals) ","meals",5,meals.mostCurrent.activityBA,meals.mostCurrent,38);
if (RapidSub.canDelegate("radiotinola_checkedchange")) { return b4a.example.meals.remoteMe.runUserSub(false, "meals","radiotinola_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 38;BA.debugLine="Private Sub radiotinola_CheckedChange(Checked As B";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="txtprice.Text = 50";
Debug.ShouldStop(64);
meals.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(50));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}