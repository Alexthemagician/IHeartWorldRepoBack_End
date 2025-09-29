package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.NotificationsRepository;
import com.myfirstapp.i_heart_world.entity.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin
public class NotificationsController {

    @Autowired
    private NotificationsRepository notificationsRepository;

    private Notifications notifications;

    @GetMapping
    public java.util.List<Notifications> getAllNotifications() {
        return notificationsRepository.findAll();
    }

    @GetMapping("/by-id")
    public Notifications getNotificationById(Long id) {
        return notificationsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Notifications addNotification(@RequestBody Notifications notifications) {
        this.notifications = notifications;
        return notificationsRepository.save(notifications);
    }

    @DeleteMapping
    public void deleteNotification(@RequestParam Long id) {
        notificationsRepository.deleteById(id);
    }
}
