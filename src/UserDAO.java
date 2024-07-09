import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    Map<String, String> db = new HashMap();

    public UserDAO() {
    }

    public void createUser(User user) {
        this.db.put(user.getId(), user.getPw());
        System.out.println(user.getId() + "님 가입을 환영합니다.");
    }

    public String getUser(String id) {
        String pw = (String)this.db.get(id);
        return pw == null ? null : pw;
    }

    public void updateUser(User user) {
        this.db.put(user.getId(), user.getPw());
        System.out.println("수정이 완료되었습니다.");
    }

    public void removeUser(User user) {
        this.db.remove(user.getId());
        System.out.println("탈퇴가 완료되었습니다.");
    }
}
