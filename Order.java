/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

package exp10;
public class Order {
private String orderid;
private String cname;
private String date;


public Order()
        {
        }
public Order( String orderid, String cname, String date) {

this.cname = cname;
this.orderid = orderid;
this.date=date;
}



public String getId() {
return orderid;
}

public void setId(String cname) {
this.orderid = orderid;
}




public String getName() {
return cname;
}

public void setName(String cname) {
this.cname=cname;
}

public String getdate() {
return date;
}

public void setdate(String date)
        {
this.date = date;
}

}
