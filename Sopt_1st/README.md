<1주차의 과제 설명>

[1번째 과제]
ConstraintDimentionRatio를 이용하여 이미지를 1:1로!
저 속성 하나로 이미지가 딱히 크기를 지정하지 않고도 1:1을 유지하는 것이 신기했다.
-->그리고 처음에 잘못 이해해서 개행을 그냥 edittext의 width크기로 개행시켰는데, 나중에 다시 읽고 Guideline을 세워 개행을 시켰다.
총 두가지 guideline을 세워 text의 시작과 끝을 잡아 guideline만큼만 크기가 지정되어 자동 개행되는 것을 확인할 수 있었다. 

[2번째 과제]
SigninActivity SignupActivity MainActivity , 총 세개의 Activity를 만들었고, SignupActivity가 앱 실행 처음 화면으로, 회원가입을 눌러 SignupActivity에 정보를 입력하고 회원가입 버튼을 누르면, SigninActivity에 아이디, 비밀번호 칸에 입력했던 정보가 뜨고, Login버튼을 누르면 HomeActivity로 이동하여 아이디, 비밀번호를 띄워주는 애플리케이션이다. 
-->초기화면 SigninActivity에서 txtSignup.setOnClickListener{}를 통해 버튼 클릭시, intnet, StartActivityForResult를 실행하여 SignupActivity와 연결 후 이동.
-->SignupActivity에서, 정보 입력 후 btnSignup.setOnClickListener{}를 통해 putExtra를 이용해 데이터를 담아 setResult로 원래 Activity로 intent전달.
-->SigninActivity에서, onActivityResult함수에서 intent와 getStringExtra통해 데이터를 전달받아 로그인 창에 띄워줌.
-->다시 btnSignin.setOnClickListener통해 로그인 버튼 누르면, putExtra로 로그인 데이터 다시 담아, HomeActivity로 이동
-->HomeActivity에서 키 값으로 데이터를 받아 띄워주며 끄읏.


[3,4번째 성장과제는 시험기간이 끝나고...찬찬히 해보기로한다....]
