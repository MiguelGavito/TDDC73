
import React from 'react';

import {
  View,
  Text,
  TextInput,
  Pressable,
  StyleSheet,
  StatusBar,
  SafeAreaView,
} from 'react-native';

// Reusable button component
function MyButton() {
  return (
    <Pressable style={styles.button}>
      <Text style={styles.buttonText}>BUTTON</Text>
    </Pressable>
  );
}

// Circular illustration
function Illustration() {
  return (
    <View style={styles.circle}>
      <Text style={[styles.emoji, styles.top]}>🎓</Text>
      <Text style={[styles.emoji, styles.right]}>📚</Text>
      <Text style={[styles.emoji, styles.bottom]}>🌎</Text>
      <Text style={[styles.emoji, styles.left]}>🧪</Text>

      <View style={styles.circleCenter}>
        <Text style={{ fontSize: 32 }}>📖</Text>
      </View>
    </View>
  );
}

export default function App() {
  return (
    <SafeAreaView style={styles.container}>
      <StatusBar
        backgroundColor="#287F73"
        barStyle="light-content"
      />

      {/* Top bar */}
      <View style={styles.header}>
        <Text style={styles.headerTitle}>
          Example 1: React Native
        </Text>
      </View>

      {/* Main layout */}
      <View style={styles.content}>

        <Illustration />

        {/* First button row */}
        <View style={styles.buttonRow}>
          <MyButton />
          <MyButton />
        </View>

        {/* Second button row */}
        <View style={styles.buttonRow}>
          <MyButton />
          <MyButton />
        </View>

        {/* Email input */}
        <View style={styles.emailRow}>
          <Text style={styles.emailLabel}>Email</Text>

          <TextInput
            style={styles.input}
            keyboardType="email-address"
            autoCapitalize="none"
          />
        </View>

      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({

  container: {
    flex: 1,
    backgroundColor: '#FAFAFA',
  },

  header: {
    height: 90,
    backgroundColor: '#287F73',
    justifyContent: 'center',
    paddingHorizontal: 25,
  },

  headerTitle: {
    color: 'white',
    fontSize: 25,
    fontWeight: 'bold',
  },

  content: {
    flex: 1,
    paddingHorizontal: 30,
    alignItems: 'center',
  },

  circle: {
    width: 230,
    height: 230,
    borderRadius: 115,
    backgroundColor: '#E8A88F',
    marginTop: 15,
    alignItems: 'center',
    justifyContent: 'center',
  },

  circleCenter: {
    width: 105,
    height: 105,
    borderRadius: 55,
    backgroundColor: '#FAFAFA',
    alignItems: 'center',
    justifyContent: 'center',
  },

  emoji: {
    position: 'absolute',
    fontSize: 28,
  },

  top: { top: 12 },
  right: { right: 12 },
  bottom: { bottom: 12 },
  left: { left: 12 },

  buttonRow: {
    width: '100%',
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginTop: 40,
  },

  button: {
    width: 125,
    height: 65,
    backgroundColor: '#D6D6D6',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 4,
    elevation: 3,
  },

  buttonText: {
    fontSize: 20,
    fontWeight: '500',
    color: '#222222',
  },

  emailRow: {
    width: '100%',
    flexDirection: 'row',
    alignItems: 'center',
    marginTop: 80,
  },

  emailLabel: {
    width: '30%',
    fontSize: 20,
    color: '#888888',
  },

  input: {
    flex: 1,
    height: 45,
    borderBottomWidth: 2,
    borderBottomColor: '#D81B60',
    fontSize: 18,
  },

});
