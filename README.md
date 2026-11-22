# TDDC73

## Interaction programming

- Miguel Gavito
- Olivier Bergant

# Git Workflow – Pair Programming

This repository is shared between two students. Follow these simple rules to keep our work organized and avoid Git conflicts.

## 1. First time setup

Clone the repository (only once):

```bash
git clone https://github.com/MiguelGavito/TDDC73.git
cd TDDC73
```

## 2. Before starting work

Always download the latest changes before editing files:

```bash
git pull
```

## 3. Working on your code

Work inside the corresponding lab folder.

Example:

```text
repository/
├── lab1/
├── lab2/
├── lab3/
├── common/
└── README.md
```

You can check which files have changed at any time:

```bash
git status
```

See the actual changes:

```bash
git diff
```

## 4. Saving and uploading your work

When you finish a task:

```bash
# Stage your changes
git add .

# Save your changes locally
git commit -m "Lab 1: implement solution"

# Upload your changes to GitHub
git push
```

Use descriptive commit messages, for example:

- `Lab 1: implement parallel algorithm`
- `Lab 2: fix input validation`
- `Lab 3: add test cases`
- `Common: update shared utilities`

## 5. Getting your partner's changes

Whenever your partner pushes new changes, download them:

```bash
git pull
```

Do this before starting your next work session.

## 6. Important rules

- Always run `git pull` before starting work.
- Always commit your changes before finishing.
- Never use `git push --force`.
- Do not modify the same code simultaneously whenever possible.
- Keep each lab's code inside its corresponding folder.
- Do not commit compiled binaries, temporary files, or personal IDE settings.
- Communicate with your partner before making major changes to shared files.

## 7. What if there is a merge conflict?

A merge conflict happens when Git cannot automatically combine changes.

1. Run `git status` to identify the conflicting files.
2. Open the files and look for conflict markers:

```text
<<<<<<< HEAD
Your changes
=======
Your partner's changes
>>>>>>> branch
```

3. Decide which changes to keep (or combine both).
4. Remove the conflict markers and save the file.
5. Stage and commit the resolved files:

```bash
git add .
git commit -m "Resolve merge conflict"
```

If the conflict happened during `git pull`, this completes the merge.

## 8. Daily workflow cheat sheet

This is the normal sequence to follow every time you work:

```bash
git pull

# Write and modify your code

git status
git add .
git commit -m "Describe your changes"
git push
```

**Remember:** `pull` gets your partner's changes, `commit` saves your work locally, and `push` shares your work with your partner.

If something goes wrong, stop and ask before using commands like `reset --hard`, `rebase`, or `push --force`.