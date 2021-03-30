import javafx.scene.control.Button;

/**
 * Created by Mr Grimu on 04/01/2017.
 */
public class BlueTheme implements IThemeFactory  {
    public Button getButton() {
        return new UpperCasedButton(new BlueButton()).createButton();
    }
    public String toString(){
        return "Blue Theme";
    }
}
