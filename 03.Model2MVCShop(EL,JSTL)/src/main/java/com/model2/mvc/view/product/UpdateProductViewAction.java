package com.model2.mvc.view.product;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;
import com.model2.mvc.service.domain.Product;


public class UpdateProductViewAction extends Action{

	@Override
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		System.out.println(prodNo);
		ProductService service=new ProductServiceImpl();
		Product product=service.getProduct(prodNo);
		
		request.setAttribute("product", product);
		
		//System.out.println("vo�Դϴ�"+vo);
		return "forward:/product/updateViewProduct.jsp";
	}
}