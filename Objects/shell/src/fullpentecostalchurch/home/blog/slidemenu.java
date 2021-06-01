
package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class slidemenu {
    public static RemoteObject myClass;
	public slidemenu() {
	}
    public static PCBA staticBA = new PCBA(null, slidemenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mslidepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mbackpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mlistview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _minanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _moutanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
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
		return new Object[] {"mBackPanel",_ref.getField(false, "_mbackpanel"),"mEventName",_ref.getField(false, "_meventname"),"mInAnimation",_ref.getField(false, "_minanimation"),"mListView",_ref.getField(false, "_mlistview"),"mModule",_ref.getField(false, "_mmodule"),"mOutAnimation",_ref.getField(false, "_moutanimation"),"mSlidePanel",_ref.getField(false, "_mslidepanel")};
}
}