
package fullpentecostalchurch.home.blog;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class facebook implements IRemote{
	public static facebook mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public facebook() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("facebook"), "fullpentecostalchurch.home.blog.facebook");
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
		pcBA = new PCBA(this, facebook.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _urlrefersh = RemoteObject.createImmutable("");
public static RemoteObject _button3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static fullpentecostalchurch.home.blog.main _main = null;
public static fullpentecostalchurch.home.blog.main1 _main1 = null;
public static fullpentecostalchurch.home.blog.chat _chat = null;
public static fullpentecostalchurch.home.blog.currency _currency = null;
public static fullpentecostalchurch.home.blog.youtube _youtube = null;
public static fullpentecostalchurch.home.blog.mission _mission = null;
public static fullpentecostalchurch.home.blog.news _news = null;
public static fullpentecostalchurch.home.blog.note _note = null;
public static fullpentecostalchurch.home.blog.prayer _prayer = null;
public static fullpentecostalchurch.home.blog.map _map = null;
public static fullpentecostalchurch.home.blog.donate _donate = null;
public static fullpentecostalchurch.home.blog.email _email = null;
public static fullpentecostalchurch.home.blog.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",facebook.mostCurrent._activity,"Button1",facebook.mostCurrent._button1,"Button2",facebook.mostCurrent._button2,"Button3",facebook.mostCurrent._button3,"Button4",facebook.mostCurrent._button4,"chat",Debug.moduleToString(fullpentecostalchurch.home.blog.chat.class),"currency",Debug.moduleToString(fullpentecostalchurch.home.blog.currency.class),"donate",Debug.moduleToString(fullpentecostalchurch.home.blog.donate.class),"email",Debug.moduleToString(fullpentecostalchurch.home.blog.email.class),"Main",Debug.moduleToString(fullpentecostalchurch.home.blog.main.class),"main1",Debug.moduleToString(fullpentecostalchurch.home.blog.main1.class),"map",Debug.moduleToString(fullpentecostalchurch.home.blog.map.class),"mission",Debug.moduleToString(fullpentecostalchurch.home.blog.mission.class),"news",Debug.moduleToString(fullpentecostalchurch.home.blog.news.class),"note",Debug.moduleToString(fullpentecostalchurch.home.blog.note.class),"prayer",Debug.moduleToString(fullpentecostalchurch.home.blog.prayer.class),"Starter",Debug.moduleToString(fullpentecostalchurch.home.blog.starter.class),"Urlrefersh",facebook.mostCurrent._urlrefersh,"WebView1",facebook.mostCurrent._webview1,"youtube",Debug.moduleToString(fullpentecostalchurch.home.blog.youtube.class)};
}
}