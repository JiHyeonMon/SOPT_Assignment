# 2주차 과제 RecyclerView

1번과제, 2번과제 같이!


<img width="201" alt="화면1" src="https://user-images.githubusercontent.com/50662636/81359223-7dd8fc80-9113-11ea-80f9-41194f902b1d.PNG"><img width="203" alt="스크롤 수행" src="https://user-images.githubusercontent.com/50662636/81359220-7c0f3900-9113-11ea-87bc-9d547d68a24d.PNG"><img width="200" alt="ItemDecoration" src="https://user-images.githubusercontent.com/50662636/81359222-7d406600-9113-11ea-9485-f78530720cc5.PNG">


순서대로 기존 화면 / 스크롤 되는 것 확인 / ItemDecoration-하단 흰 공간 줄이기

### 과제 1  [ Bottom Navigation, ViewPager RecyclerView 이용해서 직접 실습 해보기 ]

### 과제 2 [ RecyclerView의 itemDecoration , clipToPadding에 대해 공부해보시고 적용해보기 ]

**itemDecoration**은 말 그래도 item에 효과를 줄 수 있는 아이로, 이미지나 항목 사이의 구분선, 공간활용에 사용한다.

실습으로 기존에 이미지 밑 흰 공간을 줄이는 것을 해보았다.

우선, 새로 Decoration이라는 파일을 만들어 클래스를 생성해주었다.

class Decoration (private val gap: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(

    outRect: Rect,

    view: View,

    parent: RecyclerView,

    state: RecyclerView.State

    ) {

      super.getItemOffsets(outRect, view, parent, state)

      outRect.bottom = gap;

    }

}

**ClipToPadding** 은 View의 위나 아래에만 padding을 주고싶은데, parent View에 padding을 지정할 경우, 스크롤을 할 때도 그 padding이 남아있을 때 쓰면 좋은 기능이다. 사용하게 되면, 스크롤의 제일 위와 제일 아래에만 패딩이 지정되어 거리 설정을 할 수 있다. 


android:paddingTop="50dp"

android:clipToPadding="false"
