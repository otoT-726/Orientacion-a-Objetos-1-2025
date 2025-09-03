package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {
	
	private String text;
	private int likes;
	private boolean destacado;

	public WallPost() {
		this.text = "Undefined post";
		this.likes = 0;
		this.destacado = false;
	}
	
	String getText() {
		return this.text;
	};

	void setText(String text) {
		this.text = text;
	};

	int getLikes() {
		return this.likes;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	void like() {
		this.likes += 1;
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	void dislike() {
		if(this.getLikes() > 0)
			this.likes--;
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	boolean isFeatured() {
		return this.destacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	void toggleFeatured() {
		this.destacado = !this.destacado;
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}