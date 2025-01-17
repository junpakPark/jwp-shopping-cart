package cart.service.product.dto;

public class ProductDto {

	private final Long id;
	private final String name;
	private final String image;
	private final Integer price;

	public ProductDto(final Long id, final String name, final String image, final Integer price) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
	}

	public Long getId() {
		return id;
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
