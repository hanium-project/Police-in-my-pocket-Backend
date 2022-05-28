package com.pocket.police.controller;

import com.pocket.police.domain.AccountRepository;
import com.pocket.police.domain.AccountRequestDto;
import com.pocket.police.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountRepository accountRepository;
    private final AccountService accountService;

    @PostMapping("/users/signup")
    public String save(@RequestBody final AccountRequestDto params) {
        return accountService.save(params);
    }

    @PutMapping("/users/{userid}")
    public String updateAccount(@PathVariable ("userid") String id, @RequestBody AccountRequestDto requestDto) {
        return accountService.update(id, requestDto);
    }

    @DeleteMapping("/users/{userid}")
    public String deleteAccount(@PathVariable ("userid") String id) {
        accountRepository.deleteById(id); // 값 삭제
        return id;
    }

    @GetMapping("/users/login")
    public String login() {
        return "login";
    }

    @PostMapping("/users/login")
    public String loginId(@RequestBody AccountRequestDto requestDto) {
        if(accountService.login(requestDto)){
            return "로그인 성공";
        }
        return "로그인 실패";
    }

    @PostMapping("/users/password")
    public String findPassword(@RequestBody AccountRequestDto requestDto) {
        return accountService.findpw(requestDto);
    }
}
