
import resources.FT_HTML_ScriptHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author shalinib
 */
public class FT_HTML_Script extends FT_HTML_ScriptHelper
{
	/**
	 * Script Name   : <b>ChromeScript</b>
	 * Generated     : <b>09-May-2022 12:45:41 pm</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22000 ()
	 * 
	 * @since  2022/05/09
	 * @author shalinib
	 */
	public void testMain(Object[] args) 
	{
		//startApp("https://10.134.59.146:9443/PlantsByWebSphere/promo.jsf");
		startBrowser("Firefox", "https://10.134.59.146:9443/PlantsByWebSphere/promo.jsf");
		sleep(15);
		browser_htmlBrowser(document_plantsByWebSphereProd(),DEFAULT_FLAGS).maximize();
		// HTML Browser
		// Document: Plants By WebSphere Promo: https://10.134.59.146:9443/PlantsByWebSphere/promo.jsf
		image_bonsaiTree().click();
		// Document: Plants By WebSphere Product Detail: https://10.134.59.146:9443/PlantsByWebSphere/promo.jsf
		text_productQuantity().setText("5");
		sleep(3);
		browser_htmlBrowser(document_plantsByWebSphereProd(),DEFAULT_FLAGS).inputKeys("{BKSP}");
		//sleep(3);
		//browser_htmlBrowser(document_plantsByWebSphereProd(),DEFAULT_FLAGS).inputChars("5");
		sleep(3);
		//text_productQuantity().performTest(productQuantity_textVP());
		image_addToCart().click();
		// Document: Plants By WebSphere Shopping Cart: https://10.134.59.146:9443/PlantsByWebSphere/product.jsf
		image_continueShopping().click();
		sleep(5);
		// Document: Plants By WebSphere Shopping: https://10.134.59.146:9443/PlantsByWebSphere/cart.jsf
		//image_impatiens().performTest(Impatiens_ImpatiensVP());
		//sleep(5);
		image_coleus().click();
		// Document: Plants By WebSphere Product Detail: https://10.134.59.146:9443/PlantsByWebSphere/shopping.jsf
		image_addToCart2().click();
		// Document: Plants By WebSphere Shopping Cart: https://10.134.59.146:9443/PlantsByWebSphere/product.jsf
		image_checkoutNow().click();
		// Document: Plants By WebSphere Login: https://10.134.59.146:9443/PlantsByWebSphere/cart.jsf
		text_loginEmail().click();
		browser_htmlBrowser(document_plantsByWebSphereLogi(),DEFAULT_FLAGS).inputChars("ft");
		browser_htmlBrowser(document_plantsByWebSphereLogi(),DEFAULT_FLAGS).inputChars("user@hcl.com");
		text_loginPassword().click();
		browser_htmlBrowser(document_plantsByWebSphereLogi(),DEFAULT_FLAGS).inputChars("ftuser");
		image_signIn().click();
		// Document: Plants By WebSphere Order Info: https://10.134.59.146:9443/PlantsByWebSphere/login.jsf
		checkBox_orderinfoShipisbilltr().click();
		text_orderinfoCcardnum().click();
		browser_htmlBrowser(document_plantsByWebSphereOrde(),DEFAULT_FLAGS).inputChars("1");
		browser_htmlBrowser(document_plantsByWebSphereOrde(),DEFAULT_FLAGS).inputChars("234 5678 9087 4321");
		text_orderinfoCcholdername().click();
		browser_htmlBrowser(document_plantsByWebSphereOrde(),DEFAULT_FLAGS).inputChars("FT user");
		image_continue().click();
		// Document: Plants By WebSphere Checkout Final: https://10.134.59.146:9443/PlantsByWebSphere/orderinfo.jsf
		image_checkoutNow2().click();
		sleep(5);
		browser_htmlBrowser(document_plantsByWebSphereOrde(),DEFAULT_FLAGS).restore();
		sleep(5);
		browser_htmlBrowser(document_plantsByWebSphereOrde(),DEFAULT_FLAGS).close();
		//browser_htmlBrowser(document_plantsByWebSphereOrde2(),DEFAULT_FLAGS).close();
		//browser_htmlBrowser().close();
	}
}

