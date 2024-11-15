package FinalClass;

 class SocialMedia {
    
}

  class Facebook extends SocialMedia {
     void login(){
        System.out.println("Login to Facebook");
    }
}

class FakeFacebook extends Facebook {
    void login(){
        System.out.println("Login to Fake Facebook");
    }
}
