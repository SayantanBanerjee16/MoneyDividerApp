# Money Divider App
## Description
The key functionality of this Android App is to take input prices from two different users and then display the amount one needs to pay the other such that both pays an equal amount in the end.

## Concept used

The code is made to follow clean code architecture.

This application is build with the help of View Model, Live Data, and Data Binding class. Whenever there is a configuration change, such as screen rotation, activity is re-created, thus resulting views to dismiss data and re-create it.This could be avoided with ViewModel. The data persists in the view model scope and it won't gets re-created on a configuration change.

## Final Product

* The following screenshots are taken from the application. Let this be the initial screen. Notice the text view contains an initial data *"Results will be displayed here."*
 <img src="screenshots/1.jpg" width="200" height ="400"> 

* This screenshots are result when View model, Live data and Data Binding **IS NOT being used.** Notice in the second picture, the text view is re-created with initial data and calculated data is gone. Although the edit text value pertains, as edit text itself save instances on its own.

 <img src="screenshots/2.jpg" width="200" height ="400"> <img src="screenshots/3.jpg" width="400" height ="200">

* This screenshots are result when View model, Live data and Data Binding **IS being used.** Notice in the second picture, the text view is still holding the caluclated data.

 <img src="screenshots/4.jpg" width="200" height ="400"> <img src="screenshots/5.jpg" width="400" height ="200">

* Note that:- The Edit Text were able to return the value as they were set with the same ID, thus it could automatically save an instance of the state while configuration change.

