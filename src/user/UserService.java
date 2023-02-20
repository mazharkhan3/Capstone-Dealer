package user;

public class UserService {
  private UserDao userDao = new UserDao();

  public User[] getUsers() {
    return userDao.getUsers();
  }
}
