package Hooks;

import BasePage.Basepage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.io.IOException;

public class Hooks {

    @BeforeAll
    public static void beforefeature() throws IOException {

            Variables.BrowserConfig.init();

        }

        @AfterAll
            public static void closing(){
            Basepage.quitDriver();
        }
    }

