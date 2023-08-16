Parse XML, Json

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

01. activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/btn_parsexml"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="80dp"
        android:text="Parse XML Data"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4" />
    <Button
        android:id="@+id/btn_parsejson"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="80dp"
        android:text="Parse Json Data"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_parsexml" />
    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:text="PARSING XML AND JSON DATA"
        android:textSize="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>

02. activity_view.java

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ViewActivity">
    <TextView
        android:id="@+id/lbl_xml_data"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="Xml Data"
        app:layout_constraintStart_toStartOf="@+id/textView2"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:text="PARSING XML AND JSON DATA"
        android:textSize="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginTop="20dp"
        android:text="XML DATA"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />
    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="40dp"
        android:text="JSON DATA"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />
    <TextView
        android:id="@+id/lbl_json_data"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="Json Data"
        app:layout_constraintEnd_toEndOf="@+id/textView3"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

</androidx.constraintlayout.widget.ConstraintLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

01. MainActivity.java

package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnParseXml,btnParseJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnParseXml=(Button)findViewById(R.id.btn_parsexml);
        btnParseJson=(Button)findViewById(R.id.btn_parsejson);
        btnParseJson.setOnClickListener(this);
        btnParseXml.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.equals(btnParseJson))
        {
            Intent it=new Intent(this,ViewActivity.class);
            it.putExtra("mode",1);
            startActivity(it);
        }
        else if(v.equals(btnParseXml))
        {
            Intent it=new Intent(this,ViewActivity.class);
            it.putExtra("mode",2);
            startActivity(it);
        }}}

02. ViewActivity.java

package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
public class ViewActivity extends AppCompatActivity {
    TextView lblXmlData,lblJsonData;
    int mode=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lblXmlData=(TextView)findViewById(R.id.lbl_xml_data);
        lblJsonData=(TextView)findViewById(R.id.lbl_json_data);
        mode=getIntent().getIntExtra("mode",0);
        if(mode==1)
            parseJson();
        else
            parseXmlDocument();
    }
    public String parseXmlDocument()
    {
        try {
            InputStream is = getAssets().open("input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); Document doc =
                    dBuilder.parse(is);
            Element element=doc.getDocumentElement();
            element.normalize();
            NodeList nList = doc.getElementsByTagName("employee");
            for (int i=0; i<nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element2 = (Element) node;
                    lblXmlData.setText("City Name : " + getValue("city_name", element2)+"\n");
                    lblXmlData.append("Latitude : " + getValue("Latitude", element2)+"\n");
                    lblXmlData.append("Longitude : " + getValue("Longitude", element2)+"\n");
                    lblXmlData.append("Temperature : " + getValue("Temperature", element2)+"\n");
                    lblXmlData.append("Humidity : " + getValue("Humidity", element2)+"\n");
                } }}
        catch (Exception e) {e.printStackTrace();}
        return null; }

    private static String getValue(String tag, Element element) { NodeList nodeList =
            element.getElementsByTagName(tag).item(0).getChildNodes(); Node node =
            nodeList.item(0);
        return node.getNodeValue();
    }
    public void parseJson()
    {
        try {
            InputStream inputStream=getAssets().open("input.json"); byte[]
                    data=new byte[inputStream.available()]; inputStream.read(data);
            String readData=new String(data);
            JSONObject jsonObject=new JSONObject(readData);
            JSONObject jsonObject1=jsonObject.getJSONObject("employee");
            lblJsonData.setText("City Name:"+jsonObject1.getString("city_name")+"\n");
            lblJsonData.append("Latitude:"+jsonObject1.getString("Latitude")+"\n");
            lblJsonData.append("Longitude"+jsonObject1.getString("Longitude")+"\n");
            lblJsonData.append("Temperature:"+jsonObject1.getInt("Temperature")+"\n");
            lblJsonData.append("Humidity"+jsonObject1.getString("Humidity")+"\n");
        }
        catch (Exception e) {e.printStackTrace();}
    }}

-----------------------------------------------------------------------
Input 
-----------------------------------------------------------------------

XML input

<?xml version="1.0"?>
<records>
    <employee>
        <city_name>Mysore</city_name>
        <Latitude>12.295</Latitude>
        <Longitude>76.639</Longitude>
        <Temperature>22</Temperature>
        <Humidity>90%</Humidity>
    </employee>
</records>

Json Input

{
  "employee": {
    "city_name": "Mysore",
    "Latitude": "12.295",
    "Longitude": "76.639",
    "Temperature": 22,
    "Humidity": "90%"
  }
}
