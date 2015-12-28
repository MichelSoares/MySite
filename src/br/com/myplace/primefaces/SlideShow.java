package br.com.myplace.primefaces;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "slide_show")
public class SlideShow {

	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();
		for (int i = 1; i <= 2; i++) {
			images.add("nature_" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}

}
