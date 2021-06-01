
package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class arcmenu {
    public static RemoteObject myClass;
	public arcmenu() {
	}
    public static PCBA staticBA = new PCBA(null, arcmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _menuitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _menuitemnewx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _menuitemnewy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _animator = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animmenuitemrotate = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animmenuitemmove = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animset = RemoteObject.declareNull("flm.b4a.animationplus.AnimationSet");
public static RemoteObject _isanimating = RemoteObject.createImmutable(false);
public static RemoteObject _staticmenubutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _animatedmenubutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mactivity = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _centerx = RemoteObject.createImmutable(0);
public static RemoteObject _centery = RemoteObject.createImmutable(0);
public static RemoteObject _menuopen = RemoteObject.createImmutable(false);
public static RemoteObject _currentposition = RemoteObject.createImmutable(0);
public static RemoteObject _animationendcount = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemanimationdelay = RemoteObject.createImmutable(0);
public static RemoteObject _staticmenubuttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _staticmenubuttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _animatedmenubuttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _animatedmenubuttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemwidth = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemheight = RemoteObject.createImmutable(0);
public static RemoteObject _startdegrees = RemoteObject.createImmutable(0);
public static RemoteObject _degreesspan = RemoteObject.createImmutable(0);
public static RemoteObject _itemradius = RemoteObject.createImmutable(0);
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
		return new Object[] {"animatedMenuButton",_ref.getField(false, "_animatedmenubutton"),"AnimatedMenuButtonHeight",_ref.getField(false, "_animatedmenubuttonheight"),"AnimatedMenuButtonWidth",_ref.getField(false, "_animatedmenubuttonwidth"),"AnimationEndCount",_ref.getField(false, "_animationendcount"),"Animator",_ref.getField(false, "_animator"),"AnimMenuItemMove",_ref.getField(false, "_animmenuitemmove"),"AnimMenuItemRotate",_ref.getField(false, "_animmenuitemrotate"),"AnimSet",_ref.getField(false, "_animset"),"Button1",_ref.getField(false, "_button1"),"CenterX",_ref.getField(false, "_centerx"),"CenterY",_ref.getField(false, "_centery"),"CurrentPosition",_ref.getField(false, "_currentposition"),"DegreesSpan",_ref.getField(false, "_degreesspan"),"IsAnimating",_ref.getField(false, "_isanimating"),"ItemRadius",_ref.getField(false, "_itemradius"),"mActivity",_ref.getField(false, "_mactivity"),"MenuItemAnimationDelay",_ref.getField(false, "_menuitemanimationdelay"),"MenuItemHeight",_ref.getField(false, "_menuitemheight"),"MenuItemNewX",_ref.getField(false, "_menuitemnewx"),"MenuItemNewY",_ref.getField(false, "_menuitemnewy"),"MenuItems",_ref.getField(false, "_menuitems"),"MenuItemWidth",_ref.getField(false, "_menuitemwidth"),"menuOpen",_ref.getField(false, "_menuopen"),"mEventName",_ref.getField(false, "_meventname"),"mModule",_ref.getField(false, "_mmodule"),"StartDegrees",_ref.getField(false, "_startdegrees"),"staticMenuButton",_ref.getField(false, "_staticmenubutton"),"StaticMenuButtonHeight",_ref.getField(false, "_staticmenubuttonheight"),"StaticMenuButtonWidth",_ref.getField(false, "_staticmenubuttonwidth")};
}
}