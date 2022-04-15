package wholeworthsgrocery;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class FXMLController implements Initializable {

    @FXML
    private TextField eggInput, milkInput, breadInput, eggSubTotal, milkSubTotal, breadSubTotal, resultSubTotal;
    private Button btnCalculate;

    @FXML
    private void btnCalculateClick(ActionEvent event) {
        int eggQty = Integer.valueOf(eggInput.getText());
        double eggDozenPrice = (eggQty / 12) * 5.0;
        double eggEachPrice = (eggQty % 12) * 0.5;
        double eggTotal = eggDozenPrice + eggEachPrice;
        eggSubTotal.setText("$ " + String.valueOf(eggDozenPrice + eggEachPrice));

        int milkQty = Integer.valueOf(milkInput.getText());
        double milkBundlePrice = (milkQty / 3) * 7.0;
        double milkEachPrice = (milkQty % 3) * 2.5;
        double milkTotal = milkBundlePrice + milkEachPrice;
        milkSubTotal.setText("$ " + String.valueOf(milkBundlePrice + milkEachPrice));

        int breadQty = Integer.valueOf(breadInput.getText());
        double breadBundlePrice = (breadQty / 2) * 6.0;
        double breadEachPrice = (breadQty % 2) * 3.5;
        double breadTotal = breadBundlePrice + breadEachPrice;
        breadSubTotal.setText("$ " + String.valueOf(breadBundlePrice + breadEachPrice));

        double totalPrice = eggTotal + milkTotal + breadTotal;
        resultSubTotal.setText("$ " + String.valueOf(totalPrice));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
