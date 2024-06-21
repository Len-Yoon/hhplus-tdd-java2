항해 플러스 1주차

❓ [과제] point 패키지의 TODO 와 테스트코드를 작성해주세요.
요구 사항

PATCH /point/{id}/charge : 포인트를 충전한다.
PATCH /point/{id}/use : 포인트를 사용한다.
GET /point/{id} : 포인트를 조회한다.
GET /point/{id}/histories : 포인트 내역을 조회한다.
잔고가 부족할 경우, 포인트 사용은 실패하여야 합니다.
동시에 여러 건의 포인트 충전, 이용 요청이 들어올 경우 순차적으로 처리되어야 합니다. (동시성)
제공 구조d

UserPoint
id
point : 포인트 정보
updateMillis : 변경 시간
PointHistory
id
userId : UserPoint Id
amount : 포인트 차감 값(충전시 +, 사용시 -)
type : 포인트 충전/사용 유무(CHARGE/USE)
updateMillis : 변경시간
image

API
PATCH /point/{id}/charge : 포인트를 충전한다.
PATCH /point/{id}/use : 포인트를 사용한다.
userId, isSuccess
GET /point/{id} : 포인트를 조회한다.
userId, point
GET /point/{id}/histories : 포인트 내역을 조회한다.
userId, list<pointhistory>, list.size(), pageable(시간 나면 추가)


테스트 시나리오
1. 포인트 충전
- 금액 음수
- 숫자형인지 아닌지 (amount)
- id 조회
- int형인지 아닌지 (UserId)
- UserId 존재 유무

2. 포인트 사용
- 포인트 값이 사용할 금액보다 큰지
- id 조회
- 내가 사용할 포인트가 음수가 아닌지

3. 포인트 조회
- id 조회

4. 포인트 내역 조회
- ‭id 조회

- 
