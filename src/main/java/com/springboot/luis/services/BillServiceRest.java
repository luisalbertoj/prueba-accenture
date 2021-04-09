package com.springboot.luis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.luis.models.Bill;
import com.springboot.luis.models.User;

@RestController
public class BillServiceRest {
	
	private static List<Bill> listaFacturas = new ArrayList<Bill>() {{}};
	
	@RequestMapping(value="/bills", method=RequestMethod.POST)
    public Bill createBill(@RequestBody Bill newBill){
		float domicilio = 10000.0f;
		float iva = 0.19f;
		if(newBill.getSubTotal() > 70000.0f) {
			newBill.setTotal(newBill.getSubTotal() + newBill.getSubTotal()*iva + domicilio);
		} else {
			newBill.setTotal(newBill.getSubTotal() + newBill.getSubTotal()*iva);
		}
		listaFacturas.add(newBill);
        return newBill;
    }
	
	 @RequestMapping(value="/bills", method=RequestMethod.GET)
	 public List<Bill>  getBills(){
        return listaFacturas;
	 }
    
}
