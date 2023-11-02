
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class clothes implements IRemote{
	public static clothes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public clothes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("clothes"), "b4a.example.clothes");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, clothes.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _txtprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _tabhost1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _checkbox3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbox9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static b4a.example.main _main = null;
public static b4a.example.shoes _shoes = null;
public static b4a.example.blouse _blouse = null;
public static b4a.example.drinks _drinks = null;
public static b4a.example.meals _meals = null;
public static b4a.example.pants _pants = null;
public static b4a.example.shorts _shorts = null;
public static b4a.example.snacks _snacks = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",clothes.mostCurrent._activity,"Blouse",Debug.moduleToString(b4a.example.blouse.class),"CheckBox1",clothes.mostCurrent._checkbox1,"CheckBox2",clothes.mostCurrent._checkbox2,"CheckBox3",clothes.mostCurrent._checkbox3,"CheckBox4",clothes.mostCurrent._checkbox4,"CheckBox5",clothes.mostCurrent._checkbox5,"CheckBox6",clothes.mostCurrent._checkbox6,"CheckBox7",clothes.mostCurrent._checkbox7,"CheckBox8",clothes.mostCurrent._checkbox8,"CheckBox9",clothes.mostCurrent._checkbox9,"Drinks",Debug.moduleToString(b4a.example.drinks.class),"ImageView1",clothes.mostCurrent._imageview1,"ImageView2",clothes.mostCurrent._imageview2,"ImageView3",clothes.mostCurrent._imageview3,"ImageView4",clothes.mostCurrent._imageview4,"ImageView5",clothes.mostCurrent._imageview5,"ImageView6",clothes.mostCurrent._imageview6,"ImageView7",clothes.mostCurrent._imageview7,"ImageView8",clothes.mostCurrent._imageview8,"ImageView9",clothes.mostCurrent._imageview9,"Main",Debug.moduleToString(b4a.example.main.class),"Meals",Debug.moduleToString(b4a.example.meals.class),"Pants",Debug.moduleToString(b4a.example.pants.class),"Shoes",Debug.moduleToString(b4a.example.shoes.class),"Shorts",Debug.moduleToString(b4a.example.shorts.class),"Snacks",Debug.moduleToString(b4a.example.snacks.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"TabHost1",clothes.mostCurrent._tabhost1,"txtprice",clothes.mostCurrent._txtprice};
}
}