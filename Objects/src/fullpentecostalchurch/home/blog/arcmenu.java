package fullpentecostalchurch.home.blog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arcmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "fullpentecostalchurch.home.blog.arcmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", fullpentecostalchurch.home.blog.arcmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _menuitems = null;
public anywheresoftware.b4a.objects.collections.List _menuitemnewx = null;
public anywheresoftware.b4a.objects.collections.List _menuitemnewy = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animator = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animmenuitemrotate = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animmenuitemmove = null;
public flm.b4a.animationplus.AnimationSet _animset = null;
public boolean _isanimating = false;
public anywheresoftware.b4a.objects.ImageViewWrapper _staticmenubutton = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _animatedmenubutton = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.ActivityWrapper _mactivity = null;
public Object _mmodule = null;
public int _centerx = 0;
public int _centery = 0;
public boolean _menuopen = false;
public int _currentposition = 0;
public int _animationendcount = 0;
public int _menuitemanimationdelay = 0;
public int _staticmenubuttonwidth = 0;
public int _staticmenubuttonheight = 0;
public int _animatedmenubuttonwidth = 0;
public int _animatedmenubuttonheight = 0;
public int _menuitemwidth = 0;
public int _menuitemheight = 0;
public int _startdegrees = 0;
public int _degreesspan = 0;
public int _itemradius = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public fullpentecostalchurch.home.blog.main _main = null;
public fullpentecostalchurch.home.blog.main1 _main1 = null;
public fullpentecostalchurch.home.blog.chat _chat = null;
public fullpentecostalchurch.home.blog.currency _currency = null;
public fullpentecostalchurch.home.blog.facebook _facebook = null;
public fullpentecostalchurch.home.blog.youtube _youtube = null;
public fullpentecostalchurch.home.blog.mission _mission = null;
public fullpentecostalchurch.home.blog.news _news = null;
public fullpentecostalchurch.home.blog.note _note = null;
public fullpentecostalchurch.home.blog.prayer _prayer = null;
public fullpentecostalchurch.home.blog.map _map = null;
public fullpentecostalchurch.home.blog.donate _donate = null;
public fullpentecostalchurch.home.blog.email _email = null;
public fullpentecostalchurch.home.blog.starter _starter = null;
public String  _initialize(fullpentecostalchurch.home.blog.arcmenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _animatedbuttonimage,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _staticbuttonimage,int _x,int _y) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_animatedbuttonimage,_staticbuttonimage,_x,_y});
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize(Activity As Activity, Module";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="CenterX = x";
__ref._centerx = _x;
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="CenterY = y";
__ref._centery = _y;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="mActivity = Activity";
__ref._mactivity = _activity;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="MenuItems.Initialize";
__ref._menuitems.Initialize();
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="If StaticButtonImage.IsInitialized Then";
if (_staticbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="staticMenuButton.Initialize(\"menuButton\")";
__ref._staticmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="staticMenuButton.Bitmap = StaticButtonImage";
__ref._staticmenubutton.setBitmap((android.graphics.Bitmap)(_staticbuttonimage.getObject()));
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="staticMenuButton.Gravity = Gravity.FILL";
__ref._staticmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="Activity.AddView(staticMenuButton, x - (StaticMe";
_activity.AddView((android.view.View)(__ref._staticmenubutton.getObject()),(int) (_x-(__ref._staticmenubuttonwidth/(double)2)),(int) (_y-(__ref._staticmenubuttonheight/(double)2)),__ref._staticmenubuttonwidth,__ref._staticmenubuttonheight);
 };
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="If AnimatedButtonImage.IsInitialized Then";
if (_animatedbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="animatedMenuButton.Initialize(\"menuButton\")";
__ref._animatedmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="animatedMenuButton.Bitmap = AnimatedButtonImage";
__ref._animatedmenubutton.setBitmap((android.graphics.Bitmap)(_animatedbuttonimage.getObject()));
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="animatedMenuButton.Gravity = Gravity.FILL";
__ref._animatedmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="Activity.AddView(animatedMenuButton, x - (Animat";
_activity.AddView((android.view.View)(__ref._animatedmenubutton.getObject()),(int) (_x-(__ref._animatedmenubuttonwidth/(double)2)),(int) (_y-(__ref._animatedmenubuttonheight/(double)2)),__ref._animatedmenubuttonwidth,__ref._animatedmenubuttonheight);
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="animatedMenuButton.BringToFront";
__ref._animatedmenubutton.BringToFront();
 };
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="End Sub";
return "";
}
public String  _setdegreespan(fullpentecostalchurch.home.blog.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setdegreespan"))
	return (String) Debug.delegate(ba, "setdegreespan", new Object[] {_value});
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub SetDegreeSpan(value As Int)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="DegreesSpan = value";
__ref._degreesspan = _value;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemradius(fullpentecostalchurch.home.blog.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setmenuitemradius"))
	return (String) Debug.delegate(ba, "setmenuitemradius", new Object[] {_value});
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub SetMenuItemRadius(value As Int)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="ItemRadius = value";
__ref._itemradius = _value;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _additem(fullpentecostalchurch.home.blog.arcmenu __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _itemimage) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "additem"))
	return (String) Debug.delegate(ba, "additem", new Object[] {_itemimage});
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub AddItem(ItemImage As Bitmap)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="img.Initialize(\"MenuItem\")";
_img.Initialize(ba,"MenuItem");
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="img.Bitmap = ItemImage";
_img.setBitmap((android.graphics.Bitmap)(_itemimage.getObject()));
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="img.Tag = CurrentPosition";
_img.setTag((Object)(__ref._currentposition));
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="MenuItems.Add(img)";
__ref._menuitems.Add((Object)(_img.getObject()));
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="mActivity.AddView(img, CenterX - (MenuItemWidth";
__ref._mactivity.AddView((android.view.View)(_img.getObject()),(int) (__ref._centerx-(__ref._menuitemwidth/(double)2)),(int) (__ref._centery-(__ref._menuitemheight/(double)2)),__ref._menuitemwidth,__ref._menuitemheight);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="CurrentPosition = CurrentPosition + 1";
__ref._currentposition = (int) (__ref._currentposition+1);
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="img.SendToBack";
_img.SendToBack();
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="End Sub";
return "";
}
public String  _animitemselected_animationend(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "animitemselected_animationend"))
	return (String) Debug.delegate(ba, "animitemselected_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub AnimItemSelected_AnimationEnd";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="img = MenuItems.Get(i)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Animator.Stop(img)";
__ref._animator.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="img.Left = CenterX - (img.Width / 2)";
_img.setLeft((int) (__ref._centerx-(_img.getWidth()/(double)2)));
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="img.Top = CenterY - (img.Height / 2)";
_img.setTop((int) (__ref._centery-(_img.getHeight()/(double)2)));
 }
};
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="menuOpen = False";
__ref._menuopen = __c.False;
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="End Sub";
return "";
}
public String  _animmenuitemmove_animationend(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "animmenuitemmove_animationend"))
	return (String) Debug.delegate(ba, "animmenuitemmove_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _itemposition = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub AnimMenuItemMove_AnimationEnd";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="If menuOpen = False Then";
if (__ref._menuopen==__c.False) { 
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="ItemPosition = (MenuItems.Size - 1) - AnimationE";
_itemposition = (int) ((__ref._menuitems.getSize()-1)-__ref._animationendcount);
 }else {
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="ItemPosition = AnimationEndCount";
_itemposition = __ref._animationendcount;
 };
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="img = MenuItems.Get(ItemPosition)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_itemposition)));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="If Not(menuOpen) Then img.Visible = False";
if (__c.Not(__ref._menuopen)) { 
_img.setVisible(__c.False);};
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="AnimMenuItemMove.Stop(img)";
__ref._animmenuitemmove.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="UpdateMenuItemPosition(MenuItems.Get(ItemPosition";
__ref._updatemenuitemposition(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_itemposition))),_itemposition);
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="If AnimationEndCount = MenuItems.Size - 1 Then";
if (__ref._animationendcount==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="IsAnimating = False";
__ref._isanimating = __c.False;
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="If SubExists(mModule, mEventName & \"_AnimationEn";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd")) { 
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd",(Object)(__ref._menuopen));};
 }else {
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="AnimationEndCount = AnimationEndCount + 1";
__ref._animationendcount = (int) (__ref._animationendcount+1);
 };
RDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="End Sub";
return "";
}
public String  _updatemenuitemposition(fullpentecostalchurch.home.blog.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _item,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "updatemenuitemposition"))
	return (String) Debug.delegate(ba, "updatemenuitemposition", new Object[] {_item,_position});
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub UpdateMenuItemPosition(Item As ImageVi";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Item.Left = MenuItemNewX.Get(Position)";
_item.setLeft((int)(BA.ObjectToNumber(__ref._menuitemnewx.Get(_position))));
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Item.Top = MenuItemNewY.Get(Position)";
_item.setTop((int)(BA.ObjectToNumber(__ref._menuitemnewy.Get(_position))));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "button1_click"))
	return (String) Debug.delegate(ba, "button1_click", null);
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Private MenuItems, MenuItemNewX, MenuItemNewY As";
_menuitems = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewx = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Private Animator, AnimMenuItemRotate, AnimMenuIte";
_animator = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemmove = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Private AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Private IsAnimating As Boolean = False";
_isanimating = __c.False;
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Private staticMenuButton, animatedMenuButton As I";
_staticmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
_animatedmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Private mActivity As Activity";
_mactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Private CenterX, CenterY As Int";
_centerx = 0;
_centery = 0;
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="Private menuOpen As Boolean = False";
_menuopen = __c.False;
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Private CurrentPosition As Int = 1";
_currentposition = (int) (1);
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Private AnimationEndCount As Int = 0";
_animationendcount = (int) (0);
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="Private MenuItemAnimationDelay As Int = 80";
_menuitemanimationdelay = (int) (80);
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Private StaticMenuButtonWidth As Int = 0dip";
_staticmenubuttonwidth = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="Private StaticMenuButtonHeight As Int = 0dip";
_staticmenubuttonheight = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="Private AnimatedMenuButtonWidth As Int = 55dip";
_animatedmenubuttonwidth = __c.DipToCurrent((int) (55));
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="Private AnimatedMenuButtonHeight As Int = 55dip";
_animatedmenubuttonheight = __c.DipToCurrent((int) (55));
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="Private MenuItemWidth As Int = 50dip";
_menuitemwidth = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="Private MenuItemHeight As Int = 50dip";
_menuitemheight = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=2555928;
 //BA.debugLineNum = 2555928;BA.debugLine="Private StartDegrees As Int = 0";
_startdegrees = (int) (0);
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="Private DegreesSpan As Int = 90";
_degreesspan = (int) (90);
RDebugUtils.currentLine=2555930;
 //BA.debugLineNum = 2555930;BA.debugLine="Private ItemRadius As Int = 120dip";
_itemradius = __c.DipToCurrent((int) (120));
RDebugUtils.currentLine=2555933;
 //BA.debugLineNum = 2555933;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2555934;
 //BA.debugLineNum = 2555934;BA.debugLine="End Sub";
return "";
}
public flm.b4a.animationplus.AnimationSet  _getmenuitemanimation(fullpentecostalchurch.home.blog.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem,boolean _open) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "getmenuitemanimation"))
	return (flm.b4a.animationplus.AnimationSet) Debug.delegate(ba, "getmenuitemanimation", new Object[] {_menuitem,_open});
flm.b4a.animationplus.AnimationSet _subanimset = null;
int _tox = 0;
int _toy = 0;
int _itemposition = 0;
float _degreesperitem = 0f;
float _degreeradians = 0f;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub GetMenuItemAnimation(MenuItem As Image";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim SubAnimSet As AnimationSet";
_subanimset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim ToX, ToY, ItemPosition As Int";
_tox = 0;
_toy = 0;
_itemposition = 0;
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim DegreesPerItem, DegreeRadians As Float";
_degreesperitem = 0f;
_degreeradians = 0f;
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="SubAnimSet.Initialize(False)";
_subanimset.Initialize(__c.False);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="If DegreesSpan = 360 Then DegreesSpan = 360 - (36";
if (__ref._degreesspan==360) { 
__ref._degreesspan = (int) (360-(360/(double)__ref._menuitems.getSize()));};
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="If MenuItems.Size > 1 Then";
if (__ref._menuitems.getSize()>1) { 
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="DegreesPerItem = DegreesSpan / (MenuItems.Size -";
_degreesperitem = (float) (__ref._degreesspan/(double)(__ref._menuitems.getSize()-1));
 }else {
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="DegreesPerItem = DegreesSpan";
_degreesperitem = (float) (__ref._degreesspan);
 };
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="DegreeRadians = (StartDegrees + (DegreesPerItem *";
_degreeradians = (float) ((__ref._startdegrees+(_degreesperitem*(_itemposition-1)))*__c.cPI/(double)180);
RDebugUtils.currentLine=3604498;
 //BA.debugLineNum = 3604498;BA.debugLine="ToY = (ItemRadius * (Cos(DegreeRadians)))";
_toy = (int) ((__ref._itemradius*(__c.Cos(_degreeradians))));
RDebugUtils.currentLine=3604499;
 //BA.debugLineNum = 3604499;BA.debugLine="ToX = (ItemRadius * (Sin(DegreeRadians)))";
_tox = (int) ((__ref._itemradius*(__c.Sin(_degreeradians))));
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="If Open Then";
if (_open) { 
RDebugUtils.currentLine=3604501;
 //BA.debugLineNum = 3604501;BA.debugLine="MenuItem.Visible = True";
_menuitem.setVisible(__c.True);
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 0,";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=3604503;
 //BA.debugLineNum = 3604503;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (_tox),(float) (-_toy));
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*_itemposition));
RDebugUtils.currentLine=3604505;
 //BA.debugLineNum = 3604505;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_OVERSHOOT);
RDebugUtils.currentLine=3604506;
 //BA.debugLineNum = 3604506;BA.debugLine="MenuItemNewX.Add(MenuItem.Left + ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()+_tox));
RDebugUtils.currentLine=3604507;
 //BA.debugLineNum = 3604507;BA.debugLine="MenuItemNewY.Add(MenuItem.Top - ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()-_toy));
 }else {
RDebugUtils.currentLine=3604509;
 //BA.debugLineNum = 3604509;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 36";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=3604510;
 //BA.debugLineNum = 3604510;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (-_tox),(float) (_toy));
RDebugUtils.currentLine=3604511;
 //BA.debugLineNum = 3604511;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*((__ref._menuitems.getSize()-1)-_itemposition)));
RDebugUtils.currentLine=3604512;
 //BA.debugLineNum = 3604512;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_ANTICIPATE);
RDebugUtils.currentLine=3604513;
 //BA.debugLineNum = 3604513;BA.debugLine="MenuItemNewX.Add(MenuItem.Left - ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()-_tox));
RDebugUtils.currentLine=3604514;
 //BA.debugLineNum = 3604514;BA.debugLine="MenuItemNewY.Add(MenuItem.Top + ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()+_toy));
 };
RDebugUtils.currentLine=3604518;
 //BA.debugLineNum = 3604518;BA.debugLine="AnimMenuItemRotate.Duration = 400";
__ref._animmenuitemrotate.setDuration((long) (400));
RDebugUtils.currentLine=3604519;
 //BA.debugLineNum = 3604519;BA.debugLine="AnimMenuItemRotate.RepeatCount = 0";
__ref._animmenuitemrotate.setRepeatCount((int) (0));
RDebugUtils.currentLine=3604520;
 //BA.debugLineNum = 3604520;BA.debugLine="AnimMenuItemRotate.PersistAfter = True";
__ref._animmenuitemrotate.setPersistAfter(__c.True);
RDebugUtils.currentLine=3604521;
 //BA.debugLineNum = 3604521;BA.debugLine="AnimMenuItemMove.Duration = 450";
__ref._animmenuitemmove.setDuration((long) (450));
RDebugUtils.currentLine=3604522;
 //BA.debugLineNum = 3604522;BA.debugLine="AnimMenuItemMove.RepeatCount = 0";
__ref._animmenuitemmove.setRepeatCount((int) (0));
RDebugUtils.currentLine=3604523;
 //BA.debugLineNum = 3604523;BA.debugLine="AnimMenuItemMove.PersistAfter = True";
__ref._animmenuitemmove.setPersistAfter(__c.True);
RDebugUtils.currentLine=3604525;
 //BA.debugLineNum = 3604525;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemRotate)";
_subanimset.AddAnimation(__ref._animmenuitemrotate);
RDebugUtils.currentLine=3604526;
 //BA.debugLineNum = 3604526;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemMove)";
_subanimset.AddAnimation(__ref._animmenuitemmove);
RDebugUtils.currentLine=3604528;
 //BA.debugLineNum = 3604528;BA.debugLine="SubAnimSet.PersistAfter = True";
_subanimset.setPersistAfter(__c.True);
RDebugUtils.currentLine=3604530;
 //BA.debugLineNum = 3604530;BA.debugLine="Return SubAnimSet";
if (true) return _subanimset;
RDebugUtils.currentLine=3604531;
 //BA.debugLineNum = 3604531;BA.debugLine="End Sub";
return null;
}
public String  _getselectedanimation(fullpentecostalchurch.home.blog.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "getselectedanimation"))
	return (String) Debug.delegate(ba, "getselectedanimation", new Object[] {_menuitem});
int _itemposition = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
flm.b4a.animationplus.AnimationPlusWrapper _animrotate = null;
flm.b4a.animationplus.AnimationPlusWrapper _animfade = null;
flm.b4a.animationplus.AnimationPlusWrapper _animscale = null;
int _i = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub GetSelectedAnimation(MenuItem As Image";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim AnimRotate, AnimFade, AnimScale As AnimationP";
_animrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animfade = new flm.b4a.animationplus.AnimationPlusWrapper();
_animscale = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="item = MenuItems.Get(i)";
_item.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="If item.Tag = ItemPosition Then";
if ((_item.getTag()).equals((Object)(_itemposition))) { 
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 0, 360, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 2, 2,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (2),(float) (2),(android.view.View)(_item.getObject()));
 }else {
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 360, 0, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 0, 0,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (0),(float) (0),(android.view.View)(_item.getObject()));
 };
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="If i = MenuItems.Size - 1 Then";
if (_i==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="AnimFade.InitializeAlpha(\"AnimItemSelected\", 1,";
_animfade.InitializeAlpha(ba,"AnimItemSelected",(float) (1),(float) (0));
 }else {
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="AnimFade.InitializeAlpha(\"\", 1, 0)";
_animfade.InitializeAlpha(ba,"",(float) (1),(float) (0));
 };
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="AnimRotate.Duration = 200";
_animrotate.setDuration((long) (200));
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="AnimRotate.RepeatCount = 3";
_animrotate.setRepeatCount((int) (3));
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="AnimFade.Duration = 400";
_animfade.setDuration((long) (400));
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="AnimFade.RepeatCount = 0";
_animfade.setRepeatCount((int) (0));
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="AnimScale.Duration = 400";
_animscale.setDuration((long) (400));
RDebugUtils.currentLine=3670048;
 //BA.debugLineNum = 3670048;BA.debugLine="AnimScale.RepeatCount = 0";
_animscale.setRepeatCount((int) (0));
RDebugUtils.currentLine=3670050;
 //BA.debugLineNum = 3670050;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=3670051;
 //BA.debugLineNum = 3670051;BA.debugLine="AnimSet.AddAnimation(AnimRotate)";
__ref._animset.AddAnimation(_animrotate);
RDebugUtils.currentLine=3670052;
 //BA.debugLineNum = 3670052;BA.debugLine="AnimSet.AddAnimation(AnimFade)";
__ref._animset.AddAnimation(_animfade);
RDebugUtils.currentLine=3670053;
 //BA.debugLineNum = 3670053;BA.debugLine="AnimSet.AddAnimation(AnimScale)";
__ref._animset.AddAnimation(_animscale);
RDebugUtils.currentLine=3670054;
 //BA.debugLineNum = 3670054;BA.debugLine="AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DEC";
__ref._animset.SetInterpolator(__ref._animset.INTERPOLATOR_DECELERATE);
RDebugUtils.currentLine=3670055;
 //BA.debugLineNum = 3670055;BA.debugLine="AnimSet.PersistAfter = True";
__ref._animset.setPersistAfter(__c.True);
RDebugUtils.currentLine=3670056;
 //BA.debugLineNum = 3670056;BA.debugLine="AnimSet.Start(item)";
__ref._animset.Start((android.view.View)(_item.getObject()));
 }
};
RDebugUtils.currentLine=3670060;
 //BA.debugLineNum = 3670060;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=3670061;
 //BA.debugLineNum = 3670061;BA.debugLine="Animator.InitializeRotateCenter(\"menuButtonRotat";
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));
RDebugUtils.currentLine=3670062;
 //BA.debugLineNum = 3670062;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=3670063;
 //BA.debugLineNum = 3670063;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=3670064;
 //BA.debugLineNum = 3670064;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=3670065;
 //BA.debugLineNum = 3670065;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
RDebugUtils.currentLine=3670067;
 //BA.debugLineNum = 3670067;BA.debugLine="End Sub";
return "";
}
public boolean  _isopen(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "isopen"))
	return (Boolean) Debug.delegate(ba, "isopen", null);
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub IsOpen As Boolean";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Return menuOpen";
if (true) return __ref._menuopen;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return false;
}
public String  _menubutton_click(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menubutton_click"))
	return (String) Debug.delegate(ba, "menubutton_click", null);
int _i = 0;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub menuButton_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If Not(IsAnimating) Then";
if (__c.Not(__ref._isanimating)) { 
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="MenuItemNewX.Initialize";
__ref._menuitemnewx.Initialize();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="MenuItemNewY.Initialize";
__ref._menuitemnewy.Initialize();
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="If menuOpen Then";
if (__ref._menuopen) { 
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="For i = MenuItems.Size - 1 To 0 Step -1";
{
final int step6 = (int) (-1);
final int limit6 = (int) (0);
_i = (int) (__ref._menuitems.getSize()-1) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
 }
};
 }else {
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonUnRotate",(float) (0),(float) (45),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="IsAnimating = True";
__ref._isanimating = __c.True;
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="menuOpen = Not(menuOpen)";
__ref._menuopen = __c.Not(__ref._menuopen);
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="AnimationEndCount = 0";
__ref._animationendcount = (int) (0);
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
 };
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_click(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menuitem_click"))
	return (String) Debug.delegate(ba, "menuitem_click", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub MenuItem_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If SubExists(mModule, mEventName & \"_Click\") Then";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_Click")) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="GetSelectedAnimation(Item)";
__ref._getselectedanimation(null,_item);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_Click\",";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_Click",_item.getTag());
 };
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_longclick(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menuitem_longclick"))
	return (String) Debug.delegate(ba, "menuitem_longclick", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub MenuItem_LongClick";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If SubExists(mModule, mEventName & \"_LongClick\")";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_LongClick")) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_LongClic";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_LongClick",_item.getTag());
 };
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public String  _setanimatedbuttondimensions(fullpentecostalchurch.home.blog.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setanimatedbuttondimensions"))
	return (String) Debug.delegate(ba, "setanimatedbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub SetAnimatedButtonDimensions(width As Int, heig";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="animatedMenuButton.width = width";
__ref._animatedmenubutton.setWidth(_width);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="animatedMenuButton.height = height";
__ref._animatedmenubutton.setHeight(_height);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="animatedMenuButton.Left = CenterX - (width / 2)";
__ref._animatedmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="animatedMenuButton.Top = CenterY - (height / 2)";
__ref._animatedmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemdimensions(fullpentecostalchurch.home.blog.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setmenuitemdimensions"))
	return (String) Debug.delegate(ba, "setmenuitemdimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub SetMenuItemDimensions(width As Int, height As";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="MenuItemWidth = width";
__ref._menuitemwidth = _width;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="MenuItemHeight = height";
__ref._menuitemheight = _height;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="End Sub";
return "";
}
public String  _setstartdegrees(fullpentecostalchurch.home.blog.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setstartdegrees"))
	return (String) Debug.delegate(ba, "setstartdegrees", new Object[] {_value});
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub SetStartDegrees(value As Int)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="StartDegrees = value";
__ref._startdegrees = _value;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public String  _setstaticbuttondimensions(fullpentecostalchurch.home.blog.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setstaticbuttondimensions"))
	return (String) Debug.delegate(ba, "setstaticbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub SetStaticButtonDimensions(width As Int, height";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="staticMenuButton.width = width";
__ref._staticmenubutton.setWidth(_width);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="staticMenuButton.height = height";
__ref._staticmenubutton.setHeight(_height);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="staticMenuButton.Left = CenterX - (width / 2)";
__ref._staticmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="staticMenuButton.Top = CenterY - (height / 2)";
__ref._staticmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="End Sub";
return "";
}
public String  _toggle(fullpentecostalchurch.home.blog.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "toggle"))
	return (String) Debug.delegate(ba, "toggle", null);
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Toggle";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="menuButton_Click";
__ref._menubutton_click(null);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
}