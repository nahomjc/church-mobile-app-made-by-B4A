package fullpentecostalchurch.home.blog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arcmenu2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "fullpentecostalchurch.home.blog.arcmenu2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", fullpentecostalchurch.home.blog.arcmenu2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
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
public String  _initialize(fullpentecostalchurch.home.blog.arcmenu2 __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _animatedbuttonimage,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _staticbuttonimage,int _x,int _y) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_animatedbuttonimage,_staticbuttonimage,_x,_y});
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Initialize(Activity As Activity, Module";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="CenterX = x";
__ref._centerx = _x;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="CenterY = y";
__ref._centery = _y;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="mActivity = Activity";
__ref._mactivity = _activity;
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="MenuItems.Initialize";
__ref._menuitems.Initialize();
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="If StaticButtonImage.IsInitialized Then";
if (_staticbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="staticMenuButton.Initialize(\"menuButton\")";
__ref._staticmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="staticMenuButton.Bitmap = StaticButtonImage";
__ref._staticmenubutton.setBitmap((android.graphics.Bitmap)(_staticbuttonimage.getObject()));
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="staticMenuButton.Gravity = Gravity.FILL";
__ref._staticmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="Activity.AddView(staticMenuButton, x - (StaticMe";
_activity.AddView((android.view.View)(__ref._staticmenubutton.getObject()),(int) (_x-(__ref._staticmenubuttonwidth/(double)2)),(int) (_y-(__ref._staticmenubuttonheight/(double)2)),__ref._staticmenubuttonwidth,__ref._staticmenubuttonheight);
 };
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="If AnimatedButtonImage.IsInitialized Then";
if (_animatedbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="animatedMenuButton.Initialize(\"menuButton\")";
__ref._animatedmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="animatedMenuButton.Bitmap = AnimatedButtonImage";
__ref._animatedmenubutton.setBitmap((android.graphics.Bitmap)(_animatedbuttonimage.getObject()));
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="animatedMenuButton.Gravity = Gravity.FILL";
__ref._animatedmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="Activity.AddView(animatedMenuButton, x - (Animat";
_activity.AddView((android.view.View)(__ref._animatedmenubutton.getObject()),(int) (_x-(__ref._animatedmenubuttonwidth/(double)2)),(int) (_y-(__ref._animatedmenubuttonheight/(double)2)),__ref._animatedmenubuttonwidth,__ref._animatedmenubuttonheight);
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="animatedMenuButton.BringToFront";
__ref._animatedmenubutton.BringToFront();
 };
RDebugUtils.currentLine=3932187;
 //BA.debugLineNum = 3932187;BA.debugLine="End Sub";
return "";
}
public String  _setdegreespan(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setdegreespan"))
	return (String) Debug.delegate(ba, "setdegreespan", new Object[] {_value});
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub SetDegreeSpan(value As Int)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="DegreesSpan = value";
__ref._degreesspan = _value;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemradius(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setmenuitemradius"))
	return (String) Debug.delegate(ba, "setmenuitemradius", new Object[] {_value});
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub SetMenuItemRadius(value As Int)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="ItemRadius = value";
__ref._itemradius = _value;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public String  _additem(fullpentecostalchurch.home.blog.arcmenu2 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _itemimage) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "additem"))
	return (String) Debug.delegate(ba, "additem", new Object[] {_itemimage});
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub AddItem(ItemImage As Bitmap)";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="img.Initialize(\"MenuItem\")";
_img.Initialize(ba,"MenuItem");
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="img.Bitmap = ItemImage";
_img.setBitmap((android.graphics.Bitmap)(_itemimage.getObject()));
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="img.Tag = CurrentPosition";
_img.setTag((Object)(__ref._currentposition));
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="MenuItems.Add(img)";
__ref._menuitems.Add((Object)(_img.getObject()));
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="mActivity.AddView(img, CenterX - (MenuItemWidth";
__ref._mactivity.AddView((android.view.View)(_img.getObject()),(int) (__ref._centerx-(__ref._menuitemwidth/(double)2)),(int) (__ref._centery-(__ref._menuitemheight/(double)2)),__ref._menuitemwidth,__ref._menuitemheight);
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="CurrentPosition = CurrentPosition + 1";
__ref._currentposition = (int) (__ref._currentposition+1);
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="img.SendToBack";
_img.SendToBack();
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="End Sub";
return "";
}
public String  _animitemselected_animationend(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "animitemselected_animationend"))
	return (String) Debug.delegate(ba, "animitemselected_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _i = 0;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub AnimItemSelected_AnimationEnd";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="img = MenuItems.Get(i)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Animator.Stop(img)";
__ref._animator.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="img.Left = CenterX - (img.Width / 2)";
_img.setLeft((int) (__ref._centerx-(_img.getWidth()/(double)2)));
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="img.Top = CenterY - (img.Height / 2)";
_img.setTop((int) (__ref._centery-(_img.getHeight()/(double)2)));
 }
};
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="menuOpen = False";
__ref._menuopen = __c.False;
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="End Sub";
return "";
}
public String  _animmenuitemmove_animationend(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "animmenuitemmove_animationend"))
	return (String) Debug.delegate(ba, "animmenuitemmove_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _itemposition = 0;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub AnimMenuItemMove_AnimationEnd";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="If menuOpen = False Then";
if (__ref._menuopen==__c.False) { 
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="ItemPosition = (MenuItems.Size - 1) - AnimationE";
_itemposition = (int) ((__ref._menuitems.getSize()-1)-__ref._animationendcount);
 }else {
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="ItemPosition = AnimationEndCount";
_itemposition = __ref._animationendcount;
 };
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="img = MenuItems.Get(ItemPosition)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_itemposition)));
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="If Not(menuOpen) Then img.Visible = False";
if (__c.Not(__ref._menuopen)) { 
_img.setVisible(__c.False);};
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="AnimMenuItemMove.Stop(img)";
__ref._animmenuitemmove.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="UpdateMenuItemPosition(MenuItems.Get(ItemPosition";
__ref._updatemenuitemposition(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_itemposition))),_itemposition);
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="If AnimationEndCount = MenuItems.Size - 1 Then";
if (__ref._animationendcount==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="IsAnimating = False";
__ref._isanimating = __c.False;
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="If SubExists(mModule, mEventName & \"_AnimationEn";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd")) { 
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd",(Object)(__ref._menuopen));};
 }else {
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="AnimationEndCount = AnimationEndCount + 1";
__ref._animationendcount = (int) (__ref._animationendcount+1);
 };
RDebugUtils.currentLine=4259863;
 //BA.debugLineNum = 4259863;BA.debugLine="End Sub";
return "";
}
public String  _updatemenuitemposition(fullpentecostalchurch.home.blog.arcmenu2 __ref,anywheresoftware.b4a.objects.ImageViewWrapper _item,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "updatemenuitemposition"))
	return (String) Debug.delegate(ba, "updatemenuitemposition", new Object[] {_item,_position});
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub UpdateMenuItemPosition(Item As ImageVi";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Item.Left = MenuItemNewX.Get(Position)";
_item.setLeft((int)(BA.ObjectToNumber(__ref._menuitemnewx.Get(_position))));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Item.Top = MenuItemNewY.Get(Position)";
_item.setTop((int)(BA.ObjectToNumber(__ref._menuitemnewy.Get(_position))));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "button1_click"))
	return (String) Debug.delegate(ba, "button1_click", null);
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _button2_click(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "button2_click"))
	return (String) Debug.delegate(ba, "button2_click", null);
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Private MenuItems, MenuItemNewX, MenuItemNewY As";
_menuitems = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewx = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Private Animator, AnimMenuItemRotate, AnimMenuIte";
_animator = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemmove = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Private AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Private IsAnimating As Boolean = False";
_isanimating = __c.False;
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Private staticMenuButton, animatedMenuButton As I";
_staticmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
_animatedmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="Private mActivity As Activity";
_mactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Private CenterX, CenterY As Int";
_centerx = 0;
_centery = 0;
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Private menuOpen As Boolean = False";
_menuopen = __c.False;
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Private CurrentPosition As Int = 1";
_currentposition = (int) (1);
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Private AnimationEndCount As Int = 0";
_animationendcount = (int) (0);
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Private MenuItemAnimationDelay As Int = 80";
_menuitemanimationdelay = (int) (80);
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="Private StaticMenuButtonWidth As Int = 0dip";
_staticmenubuttonwidth = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="Private StaticMenuButtonHeight As Int = 0dip";
_staticmenubuttonheight = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="Private AnimatedMenuButtonWidth As Int = 125dip";
_animatedmenubuttonwidth = __c.DipToCurrent((int) (125));
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="Private AnimatedMenuButtonHeight As Int = 125dip";
_animatedmenubuttonheight = __c.DipToCurrent((int) (125));
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="Private MenuItemWidth As Int = 50dip";
_menuitemwidth = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="Private MenuItemHeight As Int = 50dip";
_menuitemheight = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Private StartDegrees As Int = 0";
_startdegrees = (int) (0);
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="Private DegreesSpan As Int = 90";
_degreesspan = (int) (90);
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="Private ItemRadius As Int = 120dip";
_itemradius = __c.DipToCurrent((int) (120));
RDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="End Sub";
return "";
}
public flm.b4a.animationplus.AnimationSet  _getmenuitemanimation(fullpentecostalchurch.home.blog.arcmenu2 __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem,boolean _open) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "getmenuitemanimation"))
	return (flm.b4a.animationplus.AnimationSet) Debug.delegate(ba, "getmenuitemanimation", new Object[] {_menuitem,_open});
flm.b4a.animationplus.AnimationSet _subanimset = null;
int _tox = 0;
int _toy = 0;
int _itemposition = 0;
float _degreesperitem = 0f;
float _degreeradians = 0f;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub GetMenuItemAnimation(MenuItem As Image";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim SubAnimSet As AnimationSet";
_subanimset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim ToX, ToY, ItemPosition As Int";
_tox = 0;
_toy = 0;
_itemposition = 0;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim DegreesPerItem, DegreeRadians As Float";
_degreesperitem = 0f;
_degreeradians = 0f;
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="SubAnimSet.Initialize(False)";
_subanimset.Initialize(__c.False);
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="If DegreesSpan = 360 Then DegreesSpan = 360 - (36";
if (__ref._degreesspan==360) { 
__ref._degreesspan = (int) (360-(360/(double)__ref._menuitems.getSize()));};
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="If MenuItems.Size > 1 Then";
if (__ref._menuitems.getSize()>1) { 
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="DegreesPerItem = DegreesSpan / (MenuItems.Size -";
_degreesperitem = (float) (__ref._degreesspan/(double)(__ref._menuitems.getSize()-1));
 }else {
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="DegreesPerItem = DegreesSpan";
_degreesperitem = (float) (__ref._degreesspan);
 };
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="DegreeRadians = (StartDegrees + (DegreesPerItem *";
_degreeradians = (float) ((__ref._startdegrees+(_degreesperitem*(_itemposition-1)))*__c.cPI/(double)180);
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="ToY = (ItemRadius * (Cos(DegreeRadians)))";
_toy = (int) ((__ref._itemradius*(__c.Cos(_degreeradians))));
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="ToX = (ItemRadius * (Sin(DegreeRadians)))";
_tox = (int) ((__ref._itemradius*(__c.Sin(_degreeradians))));
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="If Open Then";
if (_open) { 
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="MenuItem.Visible = True";
_menuitem.setVisible(__c.True);
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 0,";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (_tox),(float) (-_toy));
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*_itemposition));
RDebugUtils.currentLine=4915225;
 //BA.debugLineNum = 4915225;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_OVERSHOOT);
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="MenuItemNewX.Add(MenuItem.Left + ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()+_tox));
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="MenuItemNewY.Add(MenuItem.Top - ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()-_toy));
 }else {
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 36";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (-_tox),(float) (_toy));
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*((__ref._menuitems.getSize()-1)-_itemposition)));
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_ANTICIPATE);
RDebugUtils.currentLine=4915233;
 //BA.debugLineNum = 4915233;BA.debugLine="MenuItemNewX.Add(MenuItem.Left - ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()-_tox));
RDebugUtils.currentLine=4915234;
 //BA.debugLineNum = 4915234;BA.debugLine="MenuItemNewY.Add(MenuItem.Top + ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()+_toy));
 };
RDebugUtils.currentLine=4915238;
 //BA.debugLineNum = 4915238;BA.debugLine="AnimMenuItemRotate.Duration = 400";
__ref._animmenuitemrotate.setDuration((long) (400));
RDebugUtils.currentLine=4915239;
 //BA.debugLineNum = 4915239;BA.debugLine="AnimMenuItemRotate.RepeatCount = 0";
__ref._animmenuitemrotate.setRepeatCount((int) (0));
RDebugUtils.currentLine=4915240;
 //BA.debugLineNum = 4915240;BA.debugLine="AnimMenuItemRotate.PersistAfter = True";
__ref._animmenuitemrotate.setPersistAfter(__c.True);
RDebugUtils.currentLine=4915241;
 //BA.debugLineNum = 4915241;BA.debugLine="AnimMenuItemMove.Duration = 450";
__ref._animmenuitemmove.setDuration((long) (450));
RDebugUtils.currentLine=4915242;
 //BA.debugLineNum = 4915242;BA.debugLine="AnimMenuItemMove.RepeatCount = 0";
__ref._animmenuitemmove.setRepeatCount((int) (0));
RDebugUtils.currentLine=4915243;
 //BA.debugLineNum = 4915243;BA.debugLine="AnimMenuItemMove.PersistAfter = True";
__ref._animmenuitemmove.setPersistAfter(__c.True);
RDebugUtils.currentLine=4915245;
 //BA.debugLineNum = 4915245;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemRotate)";
_subanimset.AddAnimation(__ref._animmenuitemrotate);
RDebugUtils.currentLine=4915246;
 //BA.debugLineNum = 4915246;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemMove)";
_subanimset.AddAnimation(__ref._animmenuitemmove);
RDebugUtils.currentLine=4915248;
 //BA.debugLineNum = 4915248;BA.debugLine="SubAnimSet.PersistAfter = True";
_subanimset.setPersistAfter(__c.True);
RDebugUtils.currentLine=4915250;
 //BA.debugLineNum = 4915250;BA.debugLine="Return SubAnimSet";
if (true) return _subanimset;
RDebugUtils.currentLine=4915251;
 //BA.debugLineNum = 4915251;BA.debugLine="End Sub";
return null;
}
public String  _getselectedanimation(fullpentecostalchurch.home.blog.arcmenu2 __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "getselectedanimation"))
	return (String) Debug.delegate(ba, "getselectedanimation", new Object[] {_menuitem});
int _itemposition = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
flm.b4a.animationplus.AnimationPlusWrapper _animrotate = null;
flm.b4a.animationplus.AnimationPlusWrapper _animfade = null;
flm.b4a.animationplus.AnimationPlusWrapper _animscale = null;
int _i = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub GetSelectedAnimation(MenuItem As Image";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim AnimRotate, AnimFade, AnimScale As AnimationP";
_animrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animfade = new flm.b4a.animationplus.AnimationPlusWrapper();
_animscale = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Dim AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="item = MenuItems.Get(i)";
_item.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="If item.Tag = ItemPosition Then";
if ((_item.getTag()).equals((Object)(_itemposition))) { 
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 0, 360, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 2, 2,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (2),(float) (2),(android.view.View)(_item.getObject()));
 }else {
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 360, 0, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 0, 0,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (0),(float) (0),(android.view.View)(_item.getObject()));
 };
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="If i = MenuItems.Size - 1 Then";
if (_i==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="AnimFade.InitializeAlpha(\"AnimItemSelected\", 1,";
_animfade.InitializeAlpha(ba,"AnimItemSelected",(float) (1),(float) (0));
 }else {
RDebugUtils.currentLine=4980760;
 //BA.debugLineNum = 4980760;BA.debugLine="AnimFade.InitializeAlpha(\"\", 1, 0)";
_animfade.InitializeAlpha(ba,"",(float) (1),(float) (0));
 };
RDebugUtils.currentLine=4980763;
 //BA.debugLineNum = 4980763;BA.debugLine="AnimRotate.Duration = 200";
_animrotate.setDuration((long) (200));
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="AnimRotate.RepeatCount = 3";
_animrotate.setRepeatCount((int) (3));
RDebugUtils.currentLine=4980765;
 //BA.debugLineNum = 4980765;BA.debugLine="AnimFade.Duration = 400";
_animfade.setDuration((long) (400));
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="AnimFade.RepeatCount = 0";
_animfade.setRepeatCount((int) (0));
RDebugUtils.currentLine=4980767;
 //BA.debugLineNum = 4980767;BA.debugLine="AnimScale.Duration = 400";
_animscale.setDuration((long) (400));
RDebugUtils.currentLine=4980768;
 //BA.debugLineNum = 4980768;BA.debugLine="AnimScale.RepeatCount = 0";
_animscale.setRepeatCount((int) (0));
RDebugUtils.currentLine=4980770;
 //BA.debugLineNum = 4980770;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=4980771;
 //BA.debugLineNum = 4980771;BA.debugLine="AnimSet.AddAnimation(AnimRotate)";
__ref._animset.AddAnimation(_animrotate);
RDebugUtils.currentLine=4980772;
 //BA.debugLineNum = 4980772;BA.debugLine="AnimSet.AddAnimation(AnimFade)";
__ref._animset.AddAnimation(_animfade);
RDebugUtils.currentLine=4980773;
 //BA.debugLineNum = 4980773;BA.debugLine="AnimSet.AddAnimation(AnimScale)";
__ref._animset.AddAnimation(_animscale);
RDebugUtils.currentLine=4980774;
 //BA.debugLineNum = 4980774;BA.debugLine="AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DEC";
__ref._animset.SetInterpolator(__ref._animset.INTERPOLATOR_DECELERATE);
RDebugUtils.currentLine=4980775;
 //BA.debugLineNum = 4980775;BA.debugLine="AnimSet.PersistAfter = True";
__ref._animset.setPersistAfter(__c.True);
RDebugUtils.currentLine=4980776;
 //BA.debugLineNum = 4980776;BA.debugLine="AnimSet.Start(item)";
__ref._animset.Start((android.view.View)(_item.getObject()));
 }
};
RDebugUtils.currentLine=4980780;
 //BA.debugLineNum = 4980780;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=4980781;
 //BA.debugLineNum = 4980781;BA.debugLine="Animator.InitializeRotateCenter(\"menuButtonRotat";
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));
RDebugUtils.currentLine=4980782;
 //BA.debugLineNum = 4980782;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=4980783;
 //BA.debugLineNum = 4980783;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=4980784;
 //BA.debugLineNum = 4980784;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=4980785;
 //BA.debugLineNum = 4980785;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
RDebugUtils.currentLine=4980787;
 //BA.debugLineNum = 4980787;BA.debugLine="End Sub";
return "";
}
public boolean  _isopen(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "isopen"))
	return (Boolean) Debug.delegate(ba, "isopen", null);
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub IsOpen As Boolean";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return menuOpen";
if (true) return __ref._menuopen;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return false;
}
public String  _menubutton_click(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "menubutton_click"))
	return (String) Debug.delegate(ba, "menubutton_click", null);
int _i = 0;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub menuButton_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If Not(IsAnimating) Then";
if (__c.Not(__ref._isanimating)) { 
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="MenuItemNewX.Initialize";
__ref._menuitemnewx.Initialize();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="MenuItemNewY.Initialize";
__ref._menuitemnewy.Initialize();
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="If menuOpen Then";
if (__ref._menuopen) { 
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (90),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="For i = MenuItems.Size - 1 To 0 Step -1";
{
final int step6 = (int) (-1);
final int limit6 = (int) (0);
_i = (int) (__ref._menuitems.getSize()-1) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
 }
};
 }else {
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonUnRotate",(float) (0),(float) (90),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="IsAnimating = True";
__ref._isanimating = __c.True;
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="menuOpen = Not(menuOpen)";
__ref._menuopen = __c.Not(__ref._menuopen);
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="AnimationEndCount = 0";
__ref._animationendcount = (int) (0);
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
 };
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_click(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "menuitem_click"))
	return (String) Debug.delegate(ba, "menuitem_click", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub MenuItem_Click";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If SubExists(mModule, mEventName & \"_Click\") Then";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_Click")) { 
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="GetSelectedAnimation(Item)";
__ref._getselectedanimation(null,_item);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_Click\",";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_Click",_item.getTag());
 };
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_longclick(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "menuitem_longclick"))
	return (String) Debug.delegate(ba, "menuitem_longclick", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub MenuItem_LongClick";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If SubExists(mModule, mEventName & \"_LongClick\")";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_LongClick")) { 
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_LongClic";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_LongClick",_item.getTag());
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
public String  _setanimatedbuttondimensions(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setanimatedbuttondimensions"))
	return (String) Debug.delegate(ba, "setanimatedbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub SetAnimatedButtonDimensions(width As Int, heig";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="animatedMenuButton.width = width";
__ref._animatedmenubutton.setWidth(_width);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="animatedMenuButton.height = height";
__ref._animatedmenubutton.setHeight(_height);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="animatedMenuButton.Left = CenterX - (width / 2)";
__ref._animatedmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="animatedMenuButton.Top = CenterY - (height / 2)";
__ref._animatedmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemdimensions(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setmenuitemdimensions"))
	return (String) Debug.delegate(ba, "setmenuitemdimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub SetMenuItemDimensions(width As Int, height As";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="MenuItemWidth = width";
__ref._menuitemwidth = _width;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="MenuItemHeight = height";
__ref._menuitemheight = _height;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return "";
}
public String  _setstartdegrees(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setstartdegrees"))
	return (String) Debug.delegate(ba, "setstartdegrees", new Object[] {_value});
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub SetStartDegrees(value As Int)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="StartDegrees = value";
__ref._startdegrees = _value;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public String  _setstaticbuttondimensions(fullpentecostalchurch.home.blog.arcmenu2 __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "setstaticbuttondimensions"))
	return (String) Debug.delegate(ba, "setstaticbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub SetStaticButtonDimensions(width As Int, height";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="staticMenuButton.width = width";
__ref._staticmenubutton.setWidth(_width);
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="staticMenuButton.height = height";
__ref._staticmenubutton.setHeight(_height);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="staticMenuButton.Left = CenterX - (width / 2)";
__ref._staticmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="staticMenuButton.Top = CenterY - (height / 2)";
__ref._staticmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="End Sub";
return "";
}
public String  _toggle(fullpentecostalchurch.home.blog.arcmenu2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu2";
if (Debug.shouldDelegate(ba, "toggle"))
	return (String) Debug.delegate(ba, "toggle", null);
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Toggle";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="menuButton_Click";
__ref._menubutton_click(null);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
}