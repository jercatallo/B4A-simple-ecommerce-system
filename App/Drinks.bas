B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.7
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

	Private txtprice As EditText
	Private chkcola As CheckBox
	Private chkroyal As CheckBox
	Private chkjuice As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("laydrinks")
	txtprice.Text = 0
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub chkroyal_CheckedChange(Checked As Boolean)
	If chkroyal.Checked = True Then
		txtprice.Text = txtprice.Text + 10
	Else
		txtprice.Text = txtprice.Text - 10
	End If
End Sub

Private Sub chkjuice_CheckedChange(Checked As Boolean)
	If chkjuice.Checked = True Then
		txtprice.Text = txtprice.Text + 5
	Else
		txtprice.Text = txtprice.Text - 5
	End If
End Sub

Private Sub chkcola_CheckedChange(Checked As Boolean)
	If chkcola.Checked = True Then
		txtprice.Text = txtprice.Text + 9
	Else
		txtprice.Text = txtprice.Text - 9
	End If
End Sub

Private Sub btnhome_Click
	Activity.Finish
End Sub

Private Sub btnclear_Click
	chkroyal.Checked = False
	chkjuice.Checked = False
	chkcola.Checked = False

	txtprice.Text = 0
End Sub

Private Sub btnaccept_Click
	If txtprice.Text = 0 Then
		ToastMessageShow("Please Complete your order for Drinks", False)
	Else
		Main.priceforclothes = txtprice.Text
		Msgbox("Transaction for Drinks Confirmed","Successful")
		Activity.Finish
	End If
End Sub