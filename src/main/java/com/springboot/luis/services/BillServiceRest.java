package com.springboot.luis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.luis.models.Bill;

public class BillServiceRest {
	
	private static List<Bill> listaFacturas = new ArrayList<Bill>() {{}};
	
	@RequestMapping(value="/bills", method=RequestMethod.POST)
    public Bill createBill(@RequestBody Bill newBill){
		float domicilio = 10000.0f;
		if(newBill.getSubTotal() > 70000.0f) {
			newBill.setTotal(newBill.getSubTotal() + newBill.getSubTotal()*0.19f + domicilio);
		} else {
			newBill.setTotal(newBill.getSubTotal() + newBill.getSubTotal()*0.19f);
		}
		listaFacturas.add(newBill);
        return newBill;
    }
    
}
