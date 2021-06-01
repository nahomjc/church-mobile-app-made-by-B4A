B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
	Private Button1 As Button
	Dim Urlrefersh As String
	Private Button2 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("map")
	WebView1.LoadUrl("https://www.google.com/maps/place/Full+Pentecostal+Church+Ethiopia/@8.9963735,38.7899676,16.88z/data=!4m8!1m2!2m1!1sfull+pentecostal+church+ethiopia!3m4!1s0x164b85e36818ab83:0x8c70c846000360e!8m2!3d8.9966926!4d38.7863504")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Button1_Click
	StartActivity(main1)
End Sub
Sub Button2_Click
	WebView1.LoadUrl(Urlrefersh)
End Sub
Sub webview1_pagefinished(url As String)
	Urlrefersh= url
End Sub