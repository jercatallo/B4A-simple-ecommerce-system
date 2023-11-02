
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

public class shorts implements IRemote{
	public static shorts mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public shorts() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("shorts"), "b4a.example.shorts");
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
		pcBA = new PCBA(this, shorts.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4a.example.main _main = null;
public static b4a.example.clothes _clothes = null;
public static b4a.example.shoes _shoes = null;
public static b4a.example.blouse _blouse = null;
public static b4a.example.drinks _drinks = null;
public static b4a.example.meals _meals = null;
public static b4a.example.pants _pants = null;
public static b4a.example.snacks _snacks = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",shorts.mostCurrent._activity,"Blouse",Debug.moduleToString(b4a.example.blouse.class),"Clothes",Debug.moduleToString(b4a.example.clothes.class),"Drinks",Debug.moduleToString(b4a.example.drinks.class),"Main",Debug.moduleToString(b4a.example.main.class),"Meals",Debug.moduleToString(b4a.example.meals.class),"Pants",Debug.moduleToString(b4a.example.pants.class),"Shoes",Debug.moduleToString(b4a.example.shoes.class),"Snacks",Debug.moduleToString(b4a.example.snacks.class),"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}