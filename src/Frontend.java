import javafx.scene.control.ColorPicker;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


/**
 * Created by Sean on 17/12/2016.
 */
// GUI was made by Sean and was beautified by James
public class Frontend {
    private JList list1;
    private JList list2;
    private JPanel Container;
    private JPanel Container1;
    private JPanel Container2;
    private JPanel Container3;
    private JPanel Container4;
    private JPanel Container5;
    private JPanel Container6;
    private JPanel Container7;
    private JLabel Currency;
    private JLabel currency1;
    private JLabel ConversionRate;
    private JLabel Time2;
    private JLabel TImeZone;
    private JLabel TImeZone1;
    private JButton button1;
    private JTextField currencyInput;
    private JButton button2;
    private JLabel TimeDifferences;
    private JPanel Container8;
    private JLabel DigitalClock1;
    private JLabel DigitalClock;
    private JLabel currencyLabel1;
    private JLabel currencyLabel2;
    private JLabel Image1;
    private JLabel Image2;
    private JButton ColourChoose;

    public Frontend() {
        //United Kingdom is automatically Selected
        list1.setSelectedIndex(13);
        list2.setSelectedIndex(13);

        //starts with UK Flags
        ImageIcon FlagStart = new ImageIcon("gb.png");

        Image1.setIcon(FlagStart);
        Image2.setIcon(FlagStart);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // List of all the countries that the user can choose from to compare - Started by Chris finished by Sean
                try {
                    String country1 = list1.getSelectedValue().toString();
                    String time1 = "";
                    String currencySymbol ="";
                    String link1 = "";
                    if(country1 == "United Kingdom"){country1 = "GBP"; time1 = "GMT+0"; currencySymbol = "£"; link1 = "gb.png";}
                    else if(country1 == "Spain"){country1 = "EUR"; time1 = "GMT+1"; currencySymbol = "€"; link1 = "es.png";}
                    else if(country1 == "Sweden"){country1 = "SEK"; time1 = "GMT+1"; currencySymbol = "kr"; link1 = "se.png";}
                    else if(country1 == "Germany"){country1 = "EUR"; time1 = "GMT+1"; currencySymbol = "€"; link1 = "de.png";}
                    else if(country1 == "Japan"){country1 = "JPY"; time1 = "GMT+9"; currencySymbol = "¥";link1 = "jp.png";}
                    else if(country1 == "Canada"){country1 = "CAD"; time1 = "GMT-6"; currencySymbol = "C$"; link1 = "ca.png";}
                    else if(country1 == "United States of America"){country1 = "USD"; time1 = "GMT-6"; currencySymbol = "$"; link1 = "us.png";}
                    else if(country1 == "Russia"){country1 = "RUB"; time1 = "GMT+3"; currencySymbol = "\u20BD"; link1 = "ru.png";}
                    else if(country1 == "Bulgaria"){country1 = "BGN"; time1 = "GMT+2"; currencySymbol = "лв"; link1 = "bg.png";}
                    else if(country1 == "Croatia"){country1 = "HRK"; time1 = "GMT+1"; currencySymbol = "kn"; link1 = "hr.png";}
                    else if(country1 == "Czech Republic"){country1 = "CZK"; time1 = "GMT+2"; currencySymbol = " Kč"; link1 = "cz.png";}
                    else if(country1 == "Denmark"){country1 = "DKK"; time1 = "GMT+1"; currencySymbol = "kr"; link1 = "dk.png";}
                    else if(country1 == "Hungary"){country1 = "HUF"; time1 = "GMT+1"; currencySymbol = "Ft"; link1 = "hu.png";}
                    else if(country1 == "Poland"){country1 = "PLN"; time1 = "GMT+1"; currencySymbol = "zł"; link1 = "pl.png";}
                    else if(country1 == "Romania"){country1 = "RON"; time1 = "GMT+2"; currencySymbol = "lei"; link1 = "ro.png";}

                    String country2 = list2.getSelectedValue().toString();
                    String time2 = "";
                    String currencySymbol2 ="";
                    String link2 = "";
                    if(country2 == "United Kingdom"){country2 = "GBP"; time2 = "GMT+0"; currencySymbol2 = "£";  link2 = "gb.png";}
                    else if(country2 == "Spain"){country2 = "EUR"; time2 = "GMT+1"; currencySymbol2 = "€"; link2 = "es.png";}
                    else if(country2 == "Sweden"){country2 = "SEK"; time2 = "GMT+1"; currencySymbol2 = "kr"; link2 = "se.png";}
                    else if(country2 == "Germany"){country2 = "EUR"; time2 = "GMT+1"; currencySymbol2 = "€"; link2 = "de.png";}
                    else if(country2 == "Japan"){country2 = "JPY"; time2 = "GMT+9"; currencySymbol2 = "¥"; link2 = "jp.png";}
                    else if(country2 == "Canada"){country2 = "CAD"; time2 = "GMT-6"; currencySymbol2 = "C$"; link2 = "ca.png"; link2 = "ca.png";}
                    else if(country2 == "United States of America"){country2 = "USD"; time2 = "GMT-6"; currencySymbol2 = "$"; link2 = "us.png";}
                    else if(country2 == "Russia"){country2 = "RUB"; time2 = "GMT+3"; currencySymbol2 = "\u20BD"; link2 = "ru.png";}
                    else if(country2 == "Bulgaria"){country2 = "BGN"; time2 = "GMT+2"; currencySymbol2 = "лв"; link2 = "bg.png";}
                    else if(country2 == "Croatia"){country2 = "HRK"; time2 = "GMT+1"; currencySymbol2 = "kn"; link2 = "hr.png";}
                    else if(country2 == "Czech Republic"){country2 = "CZK"; time2 = "GMT+2"; currencySymbol2 = " Kč"; link2 = "cz.png";}
                    else if(country2 == "Denmark"){country2 = "DKK"; time2 = "GMT+1"; currencySymbol2 = "kr"; link2 = "dk.png";}
                    else if(country2 == "Hungary"){country2 = "HUF"; time2 = "GMT+1"; currencySymbol2 = "Ft"; link2 = "hu.png";}
                    else if(country2 == "Poland"){country2 = "PLN"; time2 = "GMT+1"; currencySymbol2 = "zł"; link2 = "pl.png";}
                    else if(country2 == "Romania"){country2 = "RON"; time2 = "GMT+2"; currencySymbol2 = "lei"; link2 = "ro.png";}

                    //Adds the currency symbol before the currency amount and converted amount
                    currencyLabel1.setText(currencySymbol);
                    currencyLabel2.setText(currencySymbol2);

                    // localise the time1 and time2 by calling it from further down
                    timeZone(time1, time2);

                    //Selects Flag
                    ImageIcon Flag1 = new ImageIcon(link1);
                    ImageIcon Flag2 = new ImageIcon(link2);
                   //160 x 80

                    Image1.setIcon(Flag1);
                    Image2.setIcon(Flag2);
                    //System.out.println(link1);
                    //System.out.println(link2);

                    // Same as the above
                    Compare(country1, country2);
                }catch(Exception error){



                }
            }
        });


        //User inputting a value to be converted. - Chris
        // Labels added to help identify what is what by James.
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double convert = Double.parseDouble(ConversionRate.getText());
                    double userInput = Double.parseDouble(currencyInput.getText());
                    //Converted1 is the first value converted to the second country
                    double converted1 = (convert*userInput);
                    //Converted rounds the value to  decimal places
                    double converted = Math.round(converted1*100)/100.00;
                    currency1.setText(String.format("%.2f", converted));
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Input currency!");

                }



            }
        });
        ColourChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //Lets the user choose the background colour
                Color initialBackground = ColourChoose.getBackground();
                Color background = JColorChooser.showDialog(null, "Change Background Colour",
                        initialBackground);
                if (background != null) {
                    Container.setBackground(background);
            }
        };
    });}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Converter");
        frame.setContentPane(new Frontend().Container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(565, 565));


    }


        // This is what make the time work by using the computer system clock and adding or taking away by whatever amount. - Sean

        public void timeZone(String timeOne, String timeTwo){

            System.out.println(timeOne);
            System.out.println(timeTwo);


            //shows the time for the country
            Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeOne));
            Calendar calendar1 = new GregorianCalendar(TimeZone.getTimeZone(timeTwo));

            DateFormat formatter = new SimpleDateFormat("dd MMM  HH:mm:ss ");
            formatter.setTimeZone(TimeZone.getTimeZone(timeOne));

            DateFormat formatter1 = new SimpleDateFormat("dd MMM  HH:mm:ss ");
            formatter1.setTimeZone(TimeZone.getTimeZone(timeTwo));

            String TimeOutput1 = formatter.format(calendar.getTime());
            String TimeOutput2 = formatter1.format(calendar1.getTime());

            System.out.println(TimeOutput1);
            System.out.println(TimeOutput2);

            //num1, 2, 3 are used to calculate the time difference between selected countries
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            String timezone1 = "";
            String timezone2 = "";

            if(timeOne == "GMT+0"){num1 = 0; timezone1 = "GMT";}
            if(timeOne == "GMT+1"){num1 = 1; timezone1 = "CET";}
            if(timeOne == "GMT+2"){num1 = 2; timezone1 = "EET";}
            if(timeOne == "GMT+3"){num1 = 3; timezone1 = "MSK";}
            if(timeOne == "GMT+9"){num1 = 9; timezone1 = "JST";}
            if(timeOne == "GMT-6"){num1 = Math.abs(6)*-1; timezone1 = "CST";}

            if(timeTwo == "GMT+0"){num2 = 0; timezone2 = "GMT";}
            if(timeTwo == "GMT+1"){num2 = 1; timezone2 = "CET";}
            if(timeTwo == "GMT+2"){num2 = 2; timezone2 = "EET";}
            if(timeTwo == "GMT+3"){num2 = 3; timezone2 = "MSK";}
            if(timeTwo == "GMT+9"){num2 = 9; timezone2 = "JST";}
            if(timeTwo == "GMT-6"){num2 = Math.abs(6)*-1; timezone2 = "CST";}

            if (num1 > num2 ){num3 = num1 - num2;}
            else if(num1 < num2) {num3 = num2 - num1;}
            else if (num1 == num2) {num3 = 0;}

            DigitalClock.setText(TimeOutput1 + " " + timezone1);
            DigitalClock1.setText(TimeOutput2 + " " + timezone2);
            TimeDifferences.setText(num3 + " hours difference");

    }

    // The Yahoo api within the link it parsed by the Json to convert the currency depending on the countries selected. - Sean and James
    public void Compare(String CountryOne, String CountryTwo) throws Exception{

        URL url = new URL("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22"+CountryOne+CountryTwo+"%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");

        URLConnection con = url.openConnection();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        con.getInputStream()
                )
        );

        String inputLine;
        StringBuilder response = new StringBuilder();

        while((inputLine = in.readLine()) != null)
            response.append(inputLine);
        in.close();

        System.out.println(response);
        System.out.println(CountryOne);
        System.out.println(CountryTwo);

       parseJson(response.toString());

    }

    //This is the Json which runs the yahoo api for the currency converter. - Sean and James

    public void parseJson(String rawJson) throws JSONException {

        JSONObject obj = new JSONObject(rawJson);
        JSONObject query = obj.getJSONObject("query");
        JSONObject results = query.getJSONObject("results");
        System.out.println(results.toString());

        JSONObject rate = results.getJSONObject("rate");
            System.out.println(rate.getString("Rate"));
        ConversionRate.setText(rate.getString("Rate"));

        //System.out.println(obj.getString("Rate"));
        }





}












