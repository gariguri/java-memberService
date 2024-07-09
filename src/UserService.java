public class UserService {
    UserDAO userDAO = new UserDAO();

    public UserService() {
    }

    public void join(User user) {
        this.userDAO.createUser(user);
    }

    public void login(User user) {
        String userPw = this.userDAO.getUser(user.getId());
        if (userPw == null) {
            System.out.println("회원 정보가 없습니다.");
        } else if (!userPw.equals(user.getPw())) {
            System.out.println("비밀번호가 틀립니다.");
        } else {
            System.out.println("로그인 성공!");
            Main.isLogin = 1;
        }

    }

    public void changePw(User user) {
        this.userDAO.updateUser(user);
    }

    public void deleteUser(User user) {
        this.userDAO.removeUser(user);
    }
}
