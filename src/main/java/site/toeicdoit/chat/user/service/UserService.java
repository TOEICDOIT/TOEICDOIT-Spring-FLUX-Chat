package site.toeicdoit.chat.user.service;

import site.toeicdoit.chat.common.service.CommandService;
import site.toeicdoit.chat.common.service.QueryService;
import site.toeicdoit.chat.user.domain.dto.UserDTO;
import site.toeicdoit.chat.user.domain.model.UserModel;

public interface UserService extends QueryService<UserModel, UserDTO>, CommandService<UserModel, UserDTO>{
    
}