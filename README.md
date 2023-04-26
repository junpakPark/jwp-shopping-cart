# jwp-shopping-cart

## 1단계 기능 요구사항

- [x] DB 테이블 설계
- [x]  상품 목록 페이지 연동
    - [x]  상품 목록 페이지 조회
        - [x]  **`/`** url로 접근
    - [x]  상품 기본 정보
        - 상품 ID :
        - 상품 이름 :
        - 상품 이미지 : url 저장
        - 상품 가격 :
- [x]  상품 관리 CRUD API 작성
    - [x]  상품 생성, 상품 목록 조회, 상품 수정, 상품 삭제 API를 작성합니다.
    - [x]  API 스펙은 정해진것이 없으므로 API 설계를 직접 진행 한 후 기능을 구현 합니다.

| HTTP Method | URL            | 설명       | HTTP Status |
|-------------|----------------|----------|-------------|
| get         | /              | 상품 목록 조회 | 200         |
| post        | /products      | 상품 생성    | 201         |
| put         | /products/{id} | 상품 수정    | 200         |
| delete      | /products/{id} | 상품 삭제    | 204         |

- [x]  관리자 도구 페이지 연동
    - [x]  admin.html 파일과 상품 관리 CRUD API를 이용하여 상품 관리 페이지를 완성합니다.
    - [x]  **`/admin`**url로 접근할 경우 관리자 도구 페이지를 조회할 수 있어야 합니다

- [x]  Controller 분리
    - [x]  @RestController와 @Controller
    - [x]  @RestController의 응답코드 선정  
