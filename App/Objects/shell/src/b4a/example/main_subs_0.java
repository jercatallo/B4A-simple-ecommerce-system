package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="txtpriceshoes.Text = priceforshoes";
Debug.ShouldStop(16);
main.mostCurrent._txtpriceshoes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main._priceforshoes));
 BA.debugLineNum = 38;BA.debugLine="txtpriceclothes.Text = priceforclothes";
Debug.ShouldStop(32);
main.mostCurrent._txtpriceclothes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main._priceforclothes));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnClear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnclear_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub btnClear_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="txttotal.Text = \"\"";
Debug.ShouldStop(1024);
main.mostCurrent._txttotal.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 76;BA.debugLine="txtpriceshoes.Text = \"\"";
Debug.ShouldStop(2048);
main.mostCurrent._txtpriceshoes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 77;BA.debugLine="txtpriceclothes.Text = \"\"";
Debug.ShouldStop(4096);
main.mostCurrent._txtpriceclothes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclothes_click() throws Exception{
try {
		Debug.PushSubsStack("btnClothes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("btnclothes_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnclothes_click");}
 BA.debugLineNum = 70;BA.debugLine="Private Sub btnClothes_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="StartActivity(Clothes)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._clothes.getObject())));
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
public static RemoteObject  _btnexit_click() throws Exception{
try {
		Debug.PushSubsStack("btnexit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("btnexit_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnexit_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 54;BA.debugLine="Private Sub btnexit_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim res As Int";
Debug.ShouldStop(4194304);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 57;BA.debugLine="res = Msgbox2(\"Are you sure to exit?\",\"Exit\",\"Yes";
Debug.ShouldStop(16777216);
_res = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are you sure to exit?")),(Object)(BA.ObjectToCharSequence("Exit")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancel")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 59;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 60;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshoes_click() throws Exception{
try {
		Debug.PushSubsStack("btnShoes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,66);
if (RapidSub.canDelegate("btnshoes_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnshoes_click");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub btnShoes_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="StartActivity(Shoes)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._shoes.getObject())));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntotal_click() throws Exception{
try {
		Debug.PushSubsStack("btnTotal_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("btntotal_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btntotal_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub btnTotal_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="If  txtpriceshoes.Text = \"\" Or txtpriceclothes.Te";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtpriceshoes.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",main.mostCurrent._txtpriceclothes.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"Please Complete your Order First\", \"Warn";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Complete your Order First")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 49;BA.debugLine="txttotal.Text = txtpriceshoes.Text + txtpriceclo";
Debug.ShouldStop(65536);
main.mostCurrent._txttotal.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, main.mostCurrent._txtpriceshoes.runMethod(true,"getText")),BA.numberCast(double.class, main.mostCurrent._txtpriceclothes.runMethod(true,"getText"))}, "+",1, 0)));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private txttotal As EditText";
main.mostCurrent._txttotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnClothes As Button";
main.mostCurrent._btnclothes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnShoes As Button";
main.mostCurrent._btnshoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtpriceshoes As EditText";
main.mostCurrent._txtpriceshoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtpriceclothes As EditText";
main.mostCurrent._txtpriceclothes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
clothes_subs_0._process_globals();
shoes_subs_0._process_globals();
blouse_subs_0._process_globals();
drinks_subs_0._process_globals();
meals_subs_0._process_globals();
pants_subs_0._process_globals();
shorts_subs_0._process_globals();
snacks_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
clothes.myClass = BA.getDeviceClass ("b4a.example.clothes");
shoes.myClass = BA.getDeviceClass ("b4a.example.shoes");
blouse.myClass = BA.getDeviceClass ("b4a.example.blouse");
drinks.myClass = BA.getDeviceClass ("b4a.example.drinks");
meals.myClass = BA.getDeviceClass ("b4a.example.meals");
pants.myClass = BA.getDeviceClass ("b4a.example.pants");
shorts.myClass = BA.getDeviceClass ("b4a.example.shorts");
snacks.myClass = BA.getDeviceClass ("b4a.example.snacks");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Dim priceforshoes As String";
main._priceforshoes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim priceforclothes As String";
main._priceforclothes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}