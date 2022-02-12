package david.geraldo.data;

class SocialMedia {
    String name;    
}

final class Facebook extends SocialMedia {
    //
}

class Instagram extends SocialMedia {
    final void login(String username, String password) {
        // isi method
    }
}

/**
 * Akan error karena final class tidak bisa diwariskan/override
 */
// class FakeFacebook extends Facebook {
//     //
// }

/**
 * Akan error karena final method tidak bisa diwariskan/override
 */
// class FakeInstagram extends Instagram {
//     void login(String username, String password) {
//         // isi method
//     }
// }