package cart.dao.product.dto;

public class ProductCreateDTO {

	private final String name;
	private final String image;
	private final Integer price;

	public ProductCreateDTO(final String name, final String image, final Integer price) {
		this.name = name;
		this.image = image;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public Integer getPrice() {
		return price;
	}
}