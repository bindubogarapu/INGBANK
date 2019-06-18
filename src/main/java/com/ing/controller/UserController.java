/*
 * package com.ing.controller;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.ing.dto.AccountDTO; import com.ing.service.IAccountService;
 * 
 * @RestController
 * 
 * @CrossOrigin(allowedHeaders= {"*","/"},origins= {"*","/"})
 * 
 * @RequestMapping("/api") public class UserController {
 * 
 * @Autowired IAccountService iAccountService;
 * 
 * 
 * @GetMapping("/account/{userId}") public
 * ResponseEntity<AccountDTO>getUserAccout(@PathVariable long userId) {
 * AccountDTO accountDTO = iAccountService.getUserAccout(userId); return new
 * ResponseEntity<AccountDTO>(accountDTO,HttpStatus.OK); }
 * 
 * }
 */