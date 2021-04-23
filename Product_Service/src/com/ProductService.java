package com;

import model.Product; 
//For REST Service
import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType; 
//For JSON
import com.google.gson.*; 
//For XML
import org.jsoup.*; 
import org.jsoup.parser.*; 
import org.jsoup.nodes.Document; 
@Path("/Product") 
public class ProductService 
{ 

@POST
@Path("/") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertProduct(@FormParam("pTitle") String title, 
@FormParam("pDesc") String desc, 
@FormParam("pPrice") String price, 
@FormParam("resName") String name,
@FormParam("date") String date)

{ 
String output = productObj.insertProduct(title, desc, price, name, date); 
return output; 
}


Product productObj = new Product(); 
@GET
@Path("/") 
@Produces(MediaType.TEXT_HTML) 
public String readProducts() 
{     
return productObj.readProducts(); 
} 

}