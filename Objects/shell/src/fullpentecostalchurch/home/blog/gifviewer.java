
package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class gifviewer {
    public static RemoteObject myClass;
	public gifviewer() {
	}
    public static PCBA staticBA = new PCBA(null, gifviewer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _workindex = RemoteObject.createImmutable(0);
public static RemoteObject _bdgravity = RemoteObject.createImmutable(0);
public static RemoteObject _bitmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static fullpentecostalchurch.home.blog.main _main = null;
public static fullpentecostalchurch.home.blog.main1 _main1 = null;
public static fullpentecostalchurch.home.blog.chat _chat = null;
public static fullpentecostalchurch.home.blog.currency _currency = null;
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
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BDGravity",_ref.getField(false, "_bdgravity"),"bitmaps",_ref.getField(false, "_bitmaps"),"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"WorkIndex",_ref.getField(false, "_workindex")};
}
}