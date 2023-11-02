package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class shoes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"layShoes\")";
Debug.ShouldStop(128);
shoes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layShoes")),shoes.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(256);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 42;BA.debugLine="TabHost1.AddTab(\"Heels\",\"layheels.bal\")";
Debug.ShouldStop(512);
shoes.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Heels")),(Object)(RemoteObject.createImmutable("layheels.bal")));
 BA.debugLineNum = 43;BA.debugLine="TabHost1.AddTab(\"Wedges\",\"laywedges.bal\")";
Debug.ShouldStop(1024);
shoes.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Wedges")),(Object)(RemoteObject.createImmutable("laywedges.bal")));
 BA.debugLineNum = 44;BA.debugLine="TabHost1.AddTab(\"Loafers\",\"layloafers.bal\")";
Debug.ShouldStop(2048);
shoes.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Loafers")),(Object)(RemoteObject.createImmutable("layloafers.bal")));
 BA.debugLineNum = 45;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"h";
Debug.ShouldStop(4096);
shoes.mostCurrent._imageview1.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels1.jpg"))).getObject()));
 BA.debugLineNum = 46;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets, \"h";
Debug.ShouldStop(8192);
shoes.mostCurrent._imageview2.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels2.jpg"))).getObject()));
 BA.debugLineNum = 47;BA.debugLine="ImageView3.Bitmap = LoadBitmap(File.DirAssets, \"h";
Debug.ShouldStop(16384);
shoes.mostCurrent._imageview3.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels3.jpg"))).getObject()));
 BA.debugLineNum = 48;BA.debugLine="ImageView4.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(32768);
shoes.mostCurrent._imageview4.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges1.jpg"))).getObject()));
 BA.debugLineNum = 49;BA.debugLine="ImageView5.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(65536);
shoes.mostCurrent._imageview5.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges2.jpg"))).getObject()));
 BA.debugLineNum = 50;BA.debugLine="ImageView6.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(131072);
shoes.mostCurrent._imageview6.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges3.png"))).getObject()));
 BA.debugLineNum = 51;BA.debugLine="ImageView7.Bitmap = LoadBitmap(File.DirAssets, \"l";
Debug.ShouldStop(262144);
shoes.mostCurrent._imageview7.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("loafers1.png"))).getObject()));
 BA.debugLineNum = 52;BA.debugLine="ImageView8.Bitmap = LoadBitmap(File.DirAssets, \"l";
Debug.ShouldStop(524288);
shoes.mostCurrent._imageview8.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("loafers2.jpg"))).getObject()));
 BA.debugLineNum = 53;BA.debugLine="ImageView9.Bitmap = LoadBitmap(File.DirAssets, \"l";
Debug.ShouldStop(1048576);
shoes.mostCurrent._imageview9.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("loafers3.jpg"))).getObject()));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,56);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_resume");}
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnaccept_Click (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,83);
if (RapidSub.canDelegate("btnaccept_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnaccept_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub btnaccept_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If txtprice.Text = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._txtprice.runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 85;BA.debugLine="ToastMessageShow(\"Please Complete your order for";
Debug.ShouldStop(1048576);
shoes.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please Complete your order for Clothes")),(Object)(shoes.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 87;BA.debugLine="Main.priceforshoes = txtprice.Text";
Debug.ShouldStop(4194304);
shoes.mostCurrent._main._priceforshoes /*RemoteObject*/  = shoes.mostCurrent._txtprice.runMethod(true,"getText");
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Transaction for Clothes Confirmed\",\"Succ";
Debug.ShouldStop(8388608);
shoes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Transaction for Clothes Confirmed")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Successful"))),shoes.mostCurrent.activityBA);
 BA.debugLineNum = 89;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
shoes.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("btnclear_Click (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,69);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnclear_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub btnclear_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="CheckBox1.Checked=False";
Debug.ShouldStop(32);
shoes.mostCurrent._checkbox1.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="CheckBox2.Checked=False";
Debug.ShouldStop(64);
shoes.mostCurrent._checkbox2.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="CheckBox3.Checked=False";
Debug.ShouldStop(128);
shoes.mostCurrent._checkbox3.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="CheckBox4.Checked=False";
Debug.ShouldStop(256);
shoes.mostCurrent._checkbox4.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="CheckBox5.Checked=False";
Debug.ShouldStop(512);
shoes.mostCurrent._checkbox5.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="CheckBox6.Checked=False";
Debug.ShouldStop(1024);
shoes.mostCurrent._checkbox6.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="CheckBox7.Checked=False";
Debug.ShouldStop(2048);
shoes.mostCurrent._checkbox7.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="CheckBox8.Checked=False";
Debug.ShouldStop(4096);
shoes.mostCurrent._checkbox8.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="CheckBox9.Checked=False";
Debug.ShouldStop(8192);
shoes.mostCurrent._checkbox9.runMethodAndSync(true,"setChecked",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="txtprice.Text = 0";
Debug.ShouldStop(16384);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 80;BA.debugLine="ToastMessageShow(\"Cleared\",True)";
Debug.ShouldStop(32768);
shoes.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cleared")),(Object)(shoes.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnhome_Click (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,65);
if (RapidSub.canDelegate("btnhome_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnhome_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub btnhome_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
shoes.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox1_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,110);
if (RapidSub.canDelegate("checkbox1_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 110;BA.debugLine="Private Sub CheckBox1_CheckedChange(Checked As Boo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If CheckBox1.Checked = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox1.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 112;BA.debugLine="txtprice.Text = txtprice.Text + 300";
Debug.ShouldStop(32768);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 114;BA.debugLine="txtprice.Text = txtprice.Text - 300";
Debug.ShouldStop(131072);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "-",1, 0)));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox2_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox2_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,102);
if (RapidSub.canDelegate("checkbox2_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox2_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 102;BA.debugLine="Private Sub CheckBox2_CheckedChange(Checked As Boo";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If CheckBox2.Checked = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox2.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 104;BA.debugLine="txtprice.Text = txtprice.Text + 500";
Debug.ShouldStop(128);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 106;BA.debugLine="txtprice.Text = txtprice.Text - 500";
Debug.ShouldStop(512);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "-",1, 0)));
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox3_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox3_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,94);
if (RapidSub.canDelegate("checkbox3_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox3_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 94;BA.debugLine="Private Sub CheckBox3_CheckedChange(Checked As Boo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If CheckBox3.Checked = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox3.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 96;BA.debugLine="txtprice.Text = txtprice.Text + 400";
Debug.ShouldStop(-2147483648);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(400)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 98;BA.debugLine="txtprice.Text = txtprice.Text - 400";
Debug.ShouldStop(2);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(400)}, "-",1, 0)));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox4_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox4_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,134);
if (RapidSub.canDelegate("checkbox4_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox4_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 134;BA.debugLine="Private Sub CheckBox4_CheckedChange(Checked As Boo";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If CheckBox4.Checked = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox4.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 136;BA.debugLine="txtprice.Text = txtprice.Text + 100";
Debug.ShouldStop(128);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(100)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 138;BA.debugLine="txtprice.Text = txtprice.Text - 100";
Debug.ShouldStop(512);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(100)}, "-",1, 0)));
 };
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox5_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox5_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,126);
if (RapidSub.canDelegate("checkbox5_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox5_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 126;BA.debugLine="Private Sub CheckBox5_CheckedChange(Checked As Boo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If CheckBox5.Checked = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox5.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 128;BA.debugLine="txtprice.Text = txtprice.Text + 200";
Debug.ShouldStop(-2147483648);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 130;BA.debugLine="txtprice.Text = txtprice.Text - 200";
Debug.ShouldStop(2);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "-",1, 0)));
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox6_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox6_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,118);
if (RapidSub.canDelegate("checkbox6_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox6_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 118;BA.debugLine="Private Sub CheckBox6_CheckedChange(Checked As Boo";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If CheckBox6.Checked = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox6.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 120;BA.debugLine="txtprice.Text = txtprice.Text + 300";
Debug.ShouldStop(8388608);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 122;BA.debugLine="txtprice.Text = txtprice.Text - 300";
Debug.ShouldStop(33554432);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "-",1, 0)));
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox7_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox7_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,158);
if (RapidSub.canDelegate("checkbox7_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox7_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 158;BA.debugLine="Private Sub CheckBox7_CheckedChange(Checked As Boo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="If CheckBox7.Checked = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox7.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 160;BA.debugLine="txtprice.Text = txtprice.Text + 500";
Debug.ShouldStop(-2147483648);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 162;BA.debugLine="txtprice.Text = txtprice.Text - 500";
Debug.ShouldStop(2);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "-",1, 0)));
 };
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox8_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox8_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,150);
if (RapidSub.canDelegate("checkbox8_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox8_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 150;BA.debugLine="Private Sub CheckBox8_CheckedChange(Checked As Boo";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="If CheckBox8.Checked = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox8.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 152;BA.debugLine="txtprice.Text = txtprice.Text + 200";
Debug.ShouldStop(8388608);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 154;BA.debugLine="txtprice.Text = txtprice.Text - 200";
Debug.ShouldStop(33554432);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "-",1, 0)));
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox9_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox9_CheckedChange (shoes) ","shoes",2,shoes.mostCurrent.activityBA,shoes.mostCurrent,142);
if (RapidSub.canDelegate("checkbox9_checkedchange")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","checkbox9_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 142;BA.debugLine="Private Sub CheckBox9_CheckedChange(Checked As Boo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="If CheckBox9.Checked = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._checkbox9.runMethod(true,"getChecked"),shoes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 144;BA.debugLine="txtprice.Text = txtprice.Text + 600";
Debug.ShouldStop(32768);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(600)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 146;BA.debugLine="txtprice.Text = txtprice.Text - 600";
Debug.ShouldStop(131072);
shoes.mostCurrent._txtprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtprice.runMethod(true,"getText")),RemoteObject.createImmutable(600)}, "-",1, 0)));
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Private ImageView1 As ImageView";
shoes.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ImageView2 As ImageView";
shoes.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ImageView3 As ImageView";
shoes.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ImageView4 As ImageView";
shoes.mostCurrent._imageview4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ImageView5 As ImageView";
shoes.mostCurrent._imageview5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ImageView6 As ImageView";
shoes.mostCurrent._imageview6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ImageView7 As ImageView";
shoes.mostCurrent._imageview7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ImageView8 As ImageView";
shoes.mostCurrent._imageview8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ImageView9 As ImageView";
shoes.mostCurrent._imageview9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtprice As EditText";
shoes.mostCurrent._txtprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TabHost1 As TabHost";
shoes.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private CheckBox3 As CheckBox";
shoes.mostCurrent._checkbox3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private CheckBox2 As CheckBox";
shoes.mostCurrent._checkbox2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private CheckBox1 As CheckBox";
shoes.mostCurrent._checkbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CheckBox4 As CheckBox";
shoes.mostCurrent._checkbox4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private CheckBox5 As CheckBox";
shoes.mostCurrent._checkbox5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private CheckBox6 As CheckBox";
shoes.mostCurrent._checkbox6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private CheckBox7 As CheckBox";
shoes.mostCurrent._checkbox7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private CheckBox8 As CheckBox";
shoes.mostCurrent._checkbox8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private CheckBox9 As CheckBox";
shoes.mostCurrent._checkbox9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}