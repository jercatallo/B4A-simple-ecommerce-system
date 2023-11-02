package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class drinks_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"laydrinks\")";
Debug.ShouldStop(16777216);
drinks.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("laydrinks")),drinks.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(33554432);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
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
		Debug.PushSubsStack("Activity_Pause (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","activity_resume");}
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
		Debug.PushSubsStack("btnaccept_Click (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,74);
if (RapidSub.canDelegate("btnaccept_click")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","btnaccept_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub btnaccept_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If txtprice.Text = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",drinks.mostCurrent._txtprice.runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 76;BA.debugLine="ToastMessageShow(\"Please Complete your order for";
Debug.ShouldStop(2048);
drinks.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please Complete your order for Drinks")),(Object)(drinks.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 78;BA.debugLine="Main.priceforclothes = txtprice.Text";
Debug.ShouldStop(8192);
drinks.mostCurrent._main._priceforclothes /*RemoteObject*/  = drinks.mostCurrent._txtprice.runMethod(true,"getText");
 BA.debugLineNum = 79;BA.debugLine="Msgbox(\"Transaction for Drinks Confirmed\",\"Succe";
Debug.ShouldStop(16384);
drinks.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Transaction for Drinks Confirmed")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Successful"))),drinks.mostCurrent.activityBA);
 BA.debugLineNum = 80;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
drinks.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btnclear_Click (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,66);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","btnclear_click");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub btnclear_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="chkroyal.Checked = False";
Debug.ShouldStop(4);
drinks.mostCurrent._chkroyal.runMethodAndSync(true,"setChecked",drinks.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="chkjuice.Checked = False";
Debug.ShouldStop(8);
drinks.mostCurrent._chkjuice.runMethodAndSync(true,"setChecked",drinks.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="chkcola.Checked = False";
Debug.ShouldStop(16);
drinks.mostCurrent._chkcola.runMethodAndSync(true,"setChecked",drinks.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(64);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btnhome_Click (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,62);
if (RapidSub.canDelegate("btnhome_click")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","btnhome_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub btnhome_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
drinks.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkcola_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkcola_CheckedChange (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,54);
if (RapidSub.canDelegate("chkcola_checkedchange")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","chkcola_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 54;BA.debugLine="Private Sub chkcola_CheckedChange(Checked As Boole";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="If chkcola.Checked = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",drinks.mostCurrent._chkcola.runMethod(true,"getChecked"),drinks.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 56;BA.debugLine="txtprice.Text = txtprice.Text + 9";
Debug.ShouldStop(8388608);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(9)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 58;BA.debugLine="txtprice.Text = txtprice.Text - 9";
Debug.ShouldStop(33554432);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(9)}, "-",1, 0)));
 };
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
public static RemoteObject  _chkjuice_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkjuice_CheckedChange (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,46);
if (RapidSub.canDelegate("chkjuice_checkedchange")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","chkjuice_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 46;BA.debugLine="Private Sub chkjuice_CheckedChange(Checked As Bool";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If chkjuice.Checked = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",drinks.mostCurrent._chkjuice.runMethod(true,"getChecked"),drinks.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 48;BA.debugLine="txtprice.Text = txtprice.Text + 5";
Debug.ShouldStop(32768);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(5)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 50;BA.debugLine="txtprice.Text = txtprice.Text - 5";
Debug.ShouldStop(131072);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(5)}, "-",1, 0)));
 };
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
public static RemoteObject  _chkroyal_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkroyal_CheckedChange (drinks) ","drinks",4,drinks.mostCurrent.activityBA,drinks.mostCurrent,38);
if (RapidSub.canDelegate("chkroyal_checkedchange")) { return b4a.example.drinks.remoteMe.runUserSub(false, "drinks","chkroyal_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 38;BA.debugLine="Private Sub chkroyal_CheckedChange(Checked As Bool";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If chkroyal.Checked = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",drinks.mostCurrent._chkroyal.runMethod(true,"getChecked"),drinks.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 40;BA.debugLine="txtprice.Text = txtprice.Text + 10";
Debug.ShouldStop(128);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(10)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 42;BA.debugLine="txtprice.Text = txtprice.Text - 10";
Debug.ShouldStop(512);
drinks.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, drinks.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(10)}, "-",1, 0)));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtprice As EditText";
drinks.mostCurrent._txtprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private chkcola As CheckBox";
drinks.mostCurrent._chkcola = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private chkroyal As CheckBox";
drinks.mostCurrent._chkroyal = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private chkjuice As CheckBox";
drinks.mostCurrent._chkjuice = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}