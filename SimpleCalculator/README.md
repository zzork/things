# SimpleCalculator

![alt text](https://github.com/zzork/things/blob/master/SimpleCalculator/Screenshot.png?raw=true)

Simple calculator, created while learning JavaFX. Supports basic operations (+ - * /) on numbers of arbitrary size.

UI built using SceneBuilder and styled using CSS.

Created using the Model - View - Controller design pattern. The view (Main.fxml) relays commands to the controller (MainController.java), 
which updates the model (MainModel.java), and then relays any changes in the model back to the view.

The methods the model is required to implement are specified in the Calculator interface.
