package com.selenium;


import com.mysema.commons.lang.Assert;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class SeleniumMarki extends MySelenium {

    public SeleniumMarki() {
        this.tc_marki_input_insert();
        this.tc_modeli_page();
        this.list();

    }

    /*
        @modeli.html
        modeli name field = @Id = marki_name
        color field name = @Id = country
        price field name = @Id = eu

        button save = @Id = save

     */

    private void tc_modeli_page() {

        try {
            super.navigateToModel("http://localhost:9999/modeli.html");
            Thread.sleep(1000);
            super.inputFieldById("model_name", "e543");
            Thread.sleep(1000);
            super.inputFieldById("color", "White");
            Thread.sleep(1000);
            super.inputFieldById("price", "2000");

            Thread.sleep(1000);
            super.buttonById("save");

            Thread.sleep(1000);
            super.navigateToHome("http://localhost:9999/index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        @marki.html
        marki name field = @Id = marki_name
        county field name = @Id = country
        eu field name = @Id = eu
        marki img field name = @Id = marki_img

        button save = @Id = "saveData"
        button close info = @Id = closeModal
     */
    public void tc_marki_input_insert() {
        try {
            super.navigateToBrand("http://localhost:9999/marki.html");
            Thread.sleep(1000);
            super.inputFieldById("marki_name", "bmw");
            Thread.sleep(1000);
            super.inputFieldById("country", "Germany");
            Thread.sleep(1000);
            super.inputFieldById("eu", "true");
            Thread.sleep(1000);
            super.inputFieldById("marki_img", "bmw.jpg");
            Thread.sleep(1000);
            super.buttonById("saveData");
            Thread.sleep(1000);
            super.buttonById("closeModal");
            Thread.sleep(1000);
            super.navigateToHome("http://localhost:9999/index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void list(){
        try {
            super.navigateToModel("http://localhost:9999/modeli.html");
            Thread.sleep(1000);
            super.getTextById("modeli_id");
            Thread.sleep(1000);
            super.getTextById("modeli_name_table");
            Thread.sleep(1000);
            super.getTextById("color_table");
            Thread.sleep(1000);
            super.getTextById("price_table");
            Thread.sleep(1000);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
