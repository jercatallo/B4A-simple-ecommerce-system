package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class blouse_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (blouse) ","blouse",3,blouse.mostCurrent.activityBA,blouse.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.blouse.remoteMe.runUserSub(false, "blouse","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"layBlouse\")";
Debug.ShouldStop(4194304);
blouse.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layBlouse")),blouse.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"b";
Debug.ShouldStop(8388608);
blouse.mostCurrent._imageview1.runMethod(false,"setBitmap",(blouse.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(blouse.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("blouse1.jpg"))).getObject()));
 BA.debugLineNum = 25;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets, \"b";
Debug.ShouldStop(16777216);
blouse.mostCurrent._imageview2.runMethod(false,"setBitmap",(blouse.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(blouse.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("blouse2.jpg"))).getObject()));
 BA.debugLineNum = 26;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets, \"b";
Debug.ShouldStop(33554432);
blouse.mostCurrent._imageview3.runMethod(false,"setBitmap",(blouse.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(blouse.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("blouse3.jpg"))).getObject()));
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
		Debug.PushSubsStack("Activity_Pause (blouse) ","blouse",3,blouse.mostCurrent.activityBA,blouse.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.blouse.remoteMe.runUserSub(false, "blouse","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (blouse) ","blouse",3,blouse.mostCurrent.activityBA,blouse.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.blouse.remoteMe.runUserSub(false, "blouse","activity_resume");}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ImageView1 As ImageView";
blouse.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ImageView2 As ImageView";
blouse.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ImageView3 As ImageView";
blouse.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}