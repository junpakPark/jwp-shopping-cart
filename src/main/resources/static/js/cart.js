const addCartItem = (productId) => {
    const credentials = localStorage.getItem('credentials');

    if (!credentials) {
        alert('사용자 정보가 없습니다.');
        window.location.href = '/settings';
        return;
    }

    axios.request({
        url: '/carts/products',
        method: "POST",
        headers: {
            'Authorization': `Basic ${credentials}`,
            "Content-Type": "application/json"
        },
        data: {
            productId: productId
        }
    }).then((response) => {
        alert('장바구니에 담았습니다.');
    }).catch((error) => {
        console.error(error);
    });
}

const removeCartItem = (id) => {
    const credentials = localStorage.getItem('credentials');
    if (!credentials) {
        alert('사용자 정보가 없습니다.');
        window.location.href = '/settings';
        return;
    }

    axios.request({
        url: '/carts/products/' + id,
        method: "DELETE",
        headers: {
            'Authorization': `Basic ${credentials}`,
            "Content-Type": "application/json"
        }
    }).then((response) => {
        window.location.reload();
    }).catch((error) => {
        console.error(error);
    });
}
