package com.jsp.usermanagementsystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.usermanagementsystem.dto.UserRequest;
import com.jsp.usermanagementsystem.dto.UserResponse;
import com.jsp.usermanagementsystem.entity.User;
import com.jsp.usermanagementsystem.exception.UserNotFoundByIdException;
import com.jsp.usermanagementsystem.repository.UserRepo;
import com.jsp.usermanagementsystem.service.UserService;
import com.jsp.usermanagementsystem.util.ResponseStructure;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(UserRequest userRequest) {

		User user = new User();
		user.setUserName(userRequest.getUserName());
		user.setUserEmail(userRequest.getUserEmail());
		user.setUserPhNo(userRequest.getUserPhNo());
		user.setUserPassword(userRequest.getUserPassword());

		user = repo.save(user);
		
		UserResponse response = new UserResponse();
		response.setUserId(user.getUserId());
		response.setUserEmail(user.getUserEmail());
		response.setUserName(user.getUserName());
		response.setUserPhNo(user.getUserPhNo());

		ResponseStructure<UserResponse> structure = new ResponseStructure<UserResponse>();
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("User saved successfully!!");
		structure.setData(response);

		return new ResponseEntity<ResponseStructure<UserResponse>>(structure, HttpStatus.CREATED);
	}

	@Override
	public User updateUser(User user, int userId) {
		Optional<User> optional = repo.findById(userId);
		if (optional.isPresent()) {
			user.setUserId(userId);
			return repo.save(user);

		} else {
			throw new UserNotFoundByIdException("Failed to update User!!");
		}
	}

	@Override
	public User deleteUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
