package cams.service;

import cams.client.dto.UserDto;
import cams.service.domain.User;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 14.05.13
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */
public final class Utils {
    public static UserDto convert(User user) {
        if (user != null) {
            UserDto uDto = new UserDto();
            uDto.setId(user.getId());
            uDto.setLogin(user.getLogin());
            uDto.setPhone(user.getPhone());
            return uDto;
        }
        return null;
    }
}
