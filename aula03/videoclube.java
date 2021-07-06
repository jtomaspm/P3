package aula03;

import java.util.Comparator;
import java.util.LinkedList;


public class videoclube {
	private static LinkedList<cliente> clientes;
	private static LinkedList<video> videos;
	private static int quota;
	
	public videoclube (int quota) {
		videoclube.clientes = new LinkedList<cliente>();
		videoclube.videos = new LinkedList<video>();
		this.quota = quota;
	}
	
	public static int getQuota() {
		return videoclube.quota;
	}
	
	//	VIDEO
	
	public static video getVideo(int id) {
		return videos.get(id);
	}
	public static void setVideo(video video) {
		videos.add(video.getId(), video);
	}
	public static void removeVideo(video v) {
		videos.remove(v);
	}
	
	public static video[] getAvalibleVideosByAge(cliente c) {
		int age = c.getAge();
		LinkedList<video> s = new LinkedList<video>();
		
		for (video v : videos) {
			if(v.isAvalible()) {
				if(age >= v.getAge()) {
					s.add(v);
				}
			}
		}
		video[] b = s.toArray(new video[s.size()]);
		return b;
	}
	
	public static LinkedList<video> sortByRating () {
		LinkedList<video> r = videos;
		r.sort(Comparator.comparingDouble(video::totalRating));
		return r;
		
	}
	
	// CLIENTE
	
	public static cliente getCliente(int nrSocio) {
		return clientes.get(nrSocio);
	}
	public static void setCliente(cliente  c) {
		clientes.add(c.getNrSocio(), c);
	}
	
	
}