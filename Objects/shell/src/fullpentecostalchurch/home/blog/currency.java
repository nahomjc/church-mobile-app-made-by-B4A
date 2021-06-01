
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

public class currency implements IRemote{
	public static currency mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public currency() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("currency"), "fullpentecostalchurch.home.blog.currency");
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
		pcBA = new PCBA(this, currency.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _urlrefersh = RemoteObject.createImmutable("");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static fullpentecostalchurch.home.blog.main _main = null;
public static fullpentecostalchurch.home.blog.main1 _main1 = null;
public static fullpentecostalchurch.home.blog.chat _chat = null;
public static fullpentecostalchurch.home.blog.facebook _facebook = null;
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
		return new Object[] {"Activity",currency.mostCurrent._activity,"Button1",currency.mostCurrent._button1,"Button2",currency.mostCurrent._button2,"Button3",currency.mostCurrent._button3,"Button4",currency.mostCurrent._button4,"chat",Debug.moduleToString(fullpentecostalchurch.home.blog.chat.class),"donate",Debug.moduleToString(fullpentecostalchurch.home.blog.donate.class),"email",Debug.moduleToString(fullpentecostalchurch.home.blog.email.class),"facebook",Debug.moduleToString(fullpentecostalchurch.home.blog.facebook.class),"Main",Debug.moduleToString(fullpentecostalchurch.home.blog.main.class),"main1",Debug.moduleToString(fullpentecostalchurch.home.blog.main1.class),"map",Debug.moduleToString(fullpentecostalchurch.home.blog.map.class),"mission",Debug.moduleToString(fullpentecostalchurch.home.blog.mission.class),"news",Debug.moduleToString(fullpentecostalchurch.home.blog.news.class),"note",Debug.moduleToString(fullpentecostalchurch.home.blog.note.class),"prayer",Debug.moduleToString(fullpentecostalchurch.home.blog.prayer.class),"Starter",Debug.moduleToString(fullpentecostalchurch.home.blog.starter.class),"Urlrefersh",currency.mostCurrent._urlrefersh,"WebView1",currency.mostCurrent._webview1,"youtube",Debug.moduleToString(fullpentecostalchurch.home.blog.youtube.class)};
}
}