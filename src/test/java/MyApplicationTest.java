import com.client.AirtelCarrierSMS;
import com.client.FacebookMessenger;
import com.client.AppleiMessages;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.injector.modules.CarrierSMSModule;
import com.injector.modules.FacebookMessengerInjector;
import com.injector.modules.iMessagesProvides;

public class MyApplicationTest {
    public static void main(String[] args) {
        /**
         * Guice.createInjector() takes your Modules, and returns a new Injector instance.
         * Most applications will call this method exactly once, in their main() method.
         * An injector is Guice's object graph builder
         */
        Injector injector = Guice.createInjector(new FacebookMessengerInjector());
        Injector providesMethodsInjector = Guice.createInjector(new iMessagesProvides());
        Injector providesInjector = Guice.createInjector(new CarrierSMSModule());

        /**
         * Now that we've got the injector, we can build objects.
         */
        FacebookMessenger myApp = injector.getInstance(FacebookMessenger.class);
        myApp.sendMessage("Hi Google Guice!.", "laatanbaba@amazon.com");

        AppleiMessages appleiMessagesApp = providesMethodsInjector.getInstance(AppleiMessages.class);
        appleiMessagesApp.sendiMessage("Hi Google Guice!.", "laatanbaba@amazon.com");

        AirtelCarrierSMS airtelCarrierSMS = providesInjector.getInstance(AirtelCarrierSMS.class);
        airtelCarrierSMS.sendSMS("Hi Google Guice!.", "laatanbaba@amazon.com");
    }
}
